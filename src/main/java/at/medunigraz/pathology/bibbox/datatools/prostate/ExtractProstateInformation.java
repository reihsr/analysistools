package at.medunigraz.pathology.bibbox.datatools.prostate;

import org.jooq.Case;

import java.sql.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProstateInformation {

    private Integer MAX_PROSTATE_ID = 31000;//52376;
    private Integer INCREMENT = 100;//1000;

    private String pg_url = "jdbc:postgresql://localhost:5432/saat";
    private String pg_user = "robert";
    private String pg_password = "fenris";

    //Pattern pattern = Pattern.compile("^\\W?(\\d+).*");
    // \(?(\d\d+)[):.][)]?|\(?\d\d+[- +,]\d\d+[):.][)]?|\d\d+\([\d|I|V]*(,LI.BAS.|,RE.BAS.|,RE.MITTE|,LI.MITTE|,LI.APIKAL|,RE.APIKAL)?\)[:]
    Pattern pattern = Pattern.compile("\\(?(\\d\\d+)[):.][)]?|\\(?\\d\\d+[- +,]\\d\\d+[):.][)]?|\\d\\d+\\([\\d|I|V]*(,LI.BAS.|,RE.BAS.|,RE.MITTE|,LI.MITTE|,LI.APIKAL|,RE.APIKAL)?\\)[:]");

    Statement statement_isert = null;

    public void splitDiagnosis() {
        try (Connection connection = DriverManager.getConnection(pg_url, pg_user, pg_password)) {
            Statement statement = connection.createStatement();
            statement_isert = connection.createStatement();
            //for(int start_id = 30015; start_id <= MAX_PROSTATE_ID; start_id += INCREMENT) {
                ResultSet resultSet = statement.executeQuery("SELECT id, \"DIAGNOSE1\" diagnosis, \"HISTOLOGISCHEBESCHREIBUNG1\" histologicdescription FROM prostate.xml_report_befunddaten b\n" +
                        "WHERE (\"GEWINNUNGSART1\" = 'PN' OR \"GEWINNUNGSART1\" = 'PE')  \n" +
                        " AND \"VPATID1\" NOT IN (SELECT patient_id FROM prostate_cv.diagnosis_selection)\n" +
                        "AND \"DIAGNOSE1\" ILIKE '%metastase%' " +
                        "AND \"MATERIAL1\" NOT ILIKE '%turp%' AND \"MATERIALZUSATZ1\" NOT ILIKE '%turp%' ORDER BY RANDOM();");
                workDiagnosisIncrement(resultSet);
            //}

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
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("------------------ " + id + " ------------------");
            System.out.println(diagnosis);
            //System.out.println("");
            //splitDiagnosisText(diagnosis);

            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            System.out.println("You entered integer "+a);
            if(a == 0) {
                continue;
            } else {
                int x = in.nextInt();
                System.out.println("You entered integer "+x);


                String part = "";
                switch(a) {
                    case 1:
                        part = "Part 2 benign";
                        break;
                    case 2:
                        part = "Part 2 3+3";
                        break;
                    case 3:
                        part = "Part 2 4+4";
                        break;
                    case 4:
                        part = "Part 2 5+5";
                        break;
                    case 5:
                        part = "Part 3";
                        break;
                    default:
                }
                String gle = "";
                if(a != 1) {
                    Scanner ins = new Scanner(System.in);
                    gle = ins.nextLine();
                    System.out.println("You entered gle "+gle);
                }

                System.out.println("INSERT INTO prostate_cv.diagnosis_selection(id, patient_id, histo, gleason, dates, year_of_examination, month_of_examination, diagnosis, examination_type, part, selected_histonumber) " +
                        "SELECT b.id, b.\"VPATID1\", b.\"VHISTID1\", \"" + gle + "\", EXTRACT(YEAR FROM b.\"EINGANGSDATUM1\"), EXTRACT(MONTH FROM b.\"EINGANGSDATUM1\"), \"DIAGNOSE1\", \"GEWINNUNGSART1\", \"" + part + "\", \"" + x + "\" FROM prostate.xml_report_befunddaten b;");

                statement_isert.execute("INSERT INTO prostate_cv.diagnosis_selection(id, patient_id, histo, gleason, year_of_examination, month_of_examination, diagnosis, examination_type, part, selected_histonumber) " +
                        "(SELECT b.id, b.\"VPATID1\", b.\"VHISTID1\", '" + gle + "', EXTRACT(YEAR FROM b.\"EINGANGSDATUM1\"), EXTRACT(MONTH FROM b.\"EINGANGSDATUM1\"), \"DIAGNOSE1\", \"GEWINNUNGSART1\", '" + part + "', '" + x + "' FROM prostate.xml_report_befunddaten b WHERE b.id=" + id + ");");
            }

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
