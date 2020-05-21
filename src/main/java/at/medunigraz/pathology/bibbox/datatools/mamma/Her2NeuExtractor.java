package at.medunigraz.pathology.bibbox.datatools.mamma;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Her2NeuExtractor {

    private static final Logger logger = LogManager.getLogger(Her2NeuExtractor.class);

    private Integer MAX_PROSTATE_ID = 3000000;
    private Integer INCREMENT = 1000;//1000;

    private String pg_url = "jdbc:postgresql://localhost:5432/saat";
    private String pg_user = "robert";
    private String pg_password = "fenris";

    Pattern pattern = Pattern.compile("HER(CEP)?( |-)*?2( |-|/)? ?NEU", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);

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
            Statement statement = connection.createStatement();
            for(int start_id = 0; start_id <= MAX_PROSTATE_ID; start_id += INCREMENT) {
                ResultSet resultSet = statement.executeQuery("SELECT rezeptor_name, token, finding_id, aura_index, patient_id, age, examination_type, examination_date, examination_number, diagnosis, diagnosis_clean, organ, organ_zuordnung, doctor, doctor_id, sender, sender_id, afterfindingcount, es_anz, source, t, n, m, g, r, l, v FROM patient_repository_saat_mamma.findings_her2neu;\n");
                workDiagnosisIncrement(resultSet);
            }
        } catch (SQLException e) {
            logger.error("Connection failure.");
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }

    private void workDiagnosisIncrement(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            String diagnosis = formateDiagnosis(resultSet.getString("diagnosis"));
            testRegex(diagnosis);
        }
    }

    private void testRegex(String diagnosis) {
        Matcher matcher = pattern.matcher(diagnosis);
        if(!matcher.find()) {
            System.out.println(diagnosis);
            System.out.println("----------------------------------");
        }
    }

    private String formateDiagnosis(String diagnosis) {
        diagnosis = diagnosis.replaceAll("  ", " ");
        return diagnosis;
    }
}
