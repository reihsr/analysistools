package at.medunigraz.pathology.bibbox.datatools.mamma;

import at.medunigraz.pathology.bibbox.datatools.database.Neo4jDatabaseTesting;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Her2NeuExtractor {

    private static final Logger logger = LogManager.getLogger(Her2NeuExtractor.class);

    private Integer MAX_PROSTATE_ID = 3000000;
    private Integer INCREMENT = 1000;//1000;

    private String pg_url = "jdbc:postgresql://localhost:5432/saat";
    private String pg_user = "robert";
    private String pg_password = "fenris";

    private Set<String> tockens = new HashSet<String>();

    Pattern pattern = Pattern.compile("HER(CEP)?( |-)*?2( |-|/)? ?NEU", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);

    Pattern pattern_tocken_seperator = Pattern.compile("([ |:|\\)|\\(|;|,|\\.|/]+)");

    public Her2NeuExtractor(String pg_url, String pg_user, String pg_password, Integer MAX_PROSTATE_ID, Integer INCREMENT) {
        this.MAX_PROSTATE_ID = MAX_PROSTATE_ID;
        this.INCREMENT = INCREMENT;

        this.pg_url = pg_url;
        this.pg_user = pg_user;
        this.pg_password = pg_password;
    }

    public Her2NeuExtractor(String pg_url, String pg_user, String pg_password) {
        this.pg_url = pg_url;
        this.pg_user = pg_user;
        this.pg_password = pg_password;
    }

    public void runHer2NeuDiscriptorExtraction() {
        try (Connection connection = DriverManager.getConnection(pg_url, pg_user, pg_password)) {
            try (Neo4jDatabaseTesting greeter = new Neo4jDatabaseTesting( "bolt://localhost:7687", "neo4j", "fenris" )) {
                Statement statement = connection.createStatement();
                //for (int start_id = 0; start_id <= MAX_PROSTATE_ID; start_id += INCREMENT) {
                    ResultSet resultSet = statement.executeQuery("SELECT rezeptor_name, token, finding_id, aura_index, patient_id, age, examination_type, examination_date, examination_number, diagnosis, diagnosis_clean, organ, organ_zuordnung, " +
                            "doctor, doctor_id, sender, sender_id, afterfindingcount, es_anz, source, t, n, m, g, r, l, v FROM patient_repository_saat_mamma.findings_her2neu ORDER BY finding_id;\n");
                    workDiagnosisIncrement(resultSet, greeter);
                //}
            } catch(Exception e) {

            }
        } catch (SQLException e) {
            logger.error("Connection failure.");
            System.out.println("Connection failure.");
            e.printStackTrace();
        }

        System.out.println("######################################### ");

        for(String tocken : tockens) {
            System.out.println(tocken);
        }
    }

    private void workDiagnosisIncrement(ResultSet resultSet, Neo4jDatabaseTesting greeter) throws SQLException {
        while (resultSet.next()) {
            String diagnosis = formateDiagnosis(resultSet.getString("diagnosis"));
            testRegex(diagnosis, greeter, resultSet.getInt("finding_id"));
        }
    }

    private void testRegex(String diagnosis, Neo4jDatabaseTesting greeter, Integer diagnosisId) {
        Matcher matcher = pattern.matcher(diagnosis);

        while (matcher.find()) {
            //System.out.println(matcher.group() + ": ");
            int end = diagnosis.length();
            int start = matcher.start();
            if(start + 200 < end) {
                end = start + 200;
            }
            String diagnosis_substring = diagnosis.substring(start, end);
            tockens.addAll(tockeniceString(diagnosis_substring, greeter));
            System.out.println(diagnosisId + ": " + diagnosis_substring);
            System.out.println("----------------------------------");
        }
    }

    private String formateDiagnosis(String diagnosis) {
        diagnosis = diagnosis.replaceAll("  ", " ");
        return diagnosis;
    }

    private Set<String> tockeniceString(String datastring, Neo4jDatabaseTesting greeter) {
        Set<String> result = new HashSet<String>();

        Matcher matcher_splitt = pattern_tocken_seperator.matcher(datastring);
        int length = datastring.length();
        int start_tocken = 0;
        String tocken1 = null;
        String tocken2 = null;
        String splitter = null;
        while(matcher_splitt.find()) {
            tocken2 = datastring.substring(start_tocken, matcher_splitt.start());
            if(tocken1 != null) {
                tocken1 = tocken1.replaceAll("\n", "");
                tocken2 = tocken2.replaceAll("\n", "");
                splitter = splitter.replaceAll("\n", "");
                //System.out.println(tocken1 + " - " + splitter + " - " + tocken2);
                greeter.createNodeLink(tocken1, splitter, tocken2);
            }
            tocken1 = tocken2;
            splitter = matcher_splitt.group();
            start_tocken = matcher_splitt.end();
        }

        /*for(String tocken : datastring.split("[ |:|\\)|\\(|;|,|\\.|/]")) {
            if(tocken == null || tocken.equals("") || tocken.equals(" ")) {
                continue;
            }
            greeter.createNodeLink( tocken );

            result.add(tocken);
        }*/
        return result;
    }
}
