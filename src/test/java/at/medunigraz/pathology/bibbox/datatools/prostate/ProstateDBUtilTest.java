package at.medunigraz.pathology.bibbox.datatools.prostate;

import java.sql.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProstateDBUtilTest {

    private Integer MAX_PROSTATE_ID = 1000;//52376;
    private Integer INCREMENT = 100;//1000;

    private String pg_url = "jdbc:postgresql://localhost:5432/saat";
    private String pg_user = "robert";
    private String pg_password = "fenris";

    Pattern pattern = Pattern.compile("^\\W?(\\d+).*");

    public void splitDiagnosis() {
        try (Connection connection = DriverManager.getConnection(pg_url, pg_user, pg_password)) {
            Statement statement = connection.createStatement();
            for(int start_id = 0; start_id <= MAX_PROSTATE_ID; start_id += INCREMENT) {
                ResultSet resultSet = statement.executeQuery("SELECT id, \"DIAGNOSE1\" diagnosis, \"HISTOLOGISCHEBESCHREIBUNG1\" histologicdescription FROM prostate.xml_report_befunddaten WHERE id >= " + start_id + " AND  id < " + (start_id + INCREMENT) + "  ORDER BY id;");
                workDiagnosisIncrement(resultSet);
            }
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }

    private void workDiagnosisIncrement(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            String diagnosis = resultSet.getString("diagnosis");
            String histologicdescription = resultSet.getString("histologicdescription");
            System.out.print("------------------");
            System.out.print(diagnosis);
            System.out.print("");
            splitDiagnosisText(diagnosis);
        }
    }

    private HashMap<Integer, String> splitDiagnosisText(String text) {
        HashMap<Integer, String> returnText = new HashMap<Integer, String>();
        Matcher matcher = pattern.matcher(text);
        // check all occurance
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }

        return returnText;
    }

    //pattern = "(gl(e|i|ie|ea|eo|eao)ss?(co|eo|io|o|a|e|i)(ng|n|m|os|son)|glea(on|sn|g|sos|so)|gleaston|glesaon)( *|-|:|=)?(score|grading|grad|patter|gradn|grade)?( *|-|:|=)?( *)?\\(?(\\d) ?\\+ ?(\\d) ?=? ?(\\d*)?"

}
