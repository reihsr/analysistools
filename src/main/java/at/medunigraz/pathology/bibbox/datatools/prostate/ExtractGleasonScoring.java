package at.medunigraz.pathology.bibbox.datatools.prostate;

import java.sql.*;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractGleasonScoring {

    private Integer MAX_PROSTATE_ID = 52376;
    private Integer INCREMENT = 1000;//1000;

    private String pg_url = "jdbc:postgresql://localhost:5432/saat";
    private String pg_user = "robert";
    private String pg_password = "fenris";
    private HashSet<String> queries = new HashSet<>();

    Pattern pattern_gleason = Pattern.compile("((gl(e|i|ie|ea|eo|eao)ss?(co|eo|io|o|a|e|i)(ng|n|m|os|son))|(glea(on|sn|g|sos|so))|(gleaston)|(glesaon))( |-|:|=)?(score|grading|grad|patter|gradn|grade)?( |-|:|=)?");
    Pattern pattern_score = Pattern.compile("((\\d)( )*\\+( )*(\\d)( )*=( )*(\\d*))|((\\d)( )*\\+( )*(\\d))|((\\d)+( )*\\(?(\\d)( )*\\+( )*(\\d))|(\\d+)|([I|V|X]{1,4})");
    //(gl(e|i|ie|ea|eo|eao)ss?(co|eo|io|o|a|e|i)(ng|n|m|os|son)|glea(on|sn|g|sos|so)|gleaston|glesaon)( *|-|:|=)?(score|grading|grad|patter|gradn|grade)?(( *|-|:|=)?( *)?\(?(\d) ?\+ ?(\d) ?=? ?(\d*)?|( *|-|:|=)?( *)?\(?(\d) ?\- ?(\d) ?=? ?(\d*)?)
    //(gl(e|i|ie|ea|eo|eao)ss?(co|eo|io|o|a|e|i)(ng|n|m|os|son)|glea(on|sn|g|sos|so)|gleaston|glesaon)( *|-|:|=)?(score|grading|grad|patter|gradn|grade)?(( *|-|:|=)?( *)?\(?(\d) ?\+ ?(\d) ?=? ?(\d*)?|( *|-|:|=)?( *)?(\d)( *)?\(?(\d) ?\+? ?(\d)|( *|-|:|=)?( *)?(\d))

    public void extractGleastonScore() {
        try (Connection connection = DriverManager.getConnection(pg_url, pg_user, pg_password)) {
            Statement statement = connection.createStatement();

            for(int start_id = 0; start_id < MAX_PROSTATE_ID; start_id += INCREMENT) {
                ResultSet resultSet = statement.executeQuery("SELECT id, \"DIAGNOSE1\" diagnosis, \"VPATID1_ext\" vpatid, \"VHISTID1_ext\" vhistoid FROM prostate.xml_report_befunddaten b \n" +
                        " WHERE id >= " + start_id +
                        " ORDER BY id LIMIT " + INCREMENT + ";");
                workDiagnosisIncrement(resultSet);
            }

            for(String query : queries) {
                statement.execute(query);
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
            Integer diagnosis_length = diagnosis.length();

            int number_of_hits = 0;
            String gleason = "";
            String seperator = "";
            String groupe_gleason = "";
            String highlight = "";

            Matcher matcher = pattern_gleason.matcher(diagnosis.toLowerCase());
            while (matcher.find()) {
                Integer end = matcher.end() + 50;
                if(end > diagnosis_length) {
                    end  = diagnosis_length;
                }
                String gleason_diagnosis = diagnosis.toLowerCase().substring(matcher.end(), end);
                Matcher matcher_score = pattern_score.matcher(gleason_diagnosis);

                int counter = 0;

                while(matcher_score.find()) {
                    if(counter == 0) {
                        if(matcher_score.group(8) != null) {
                            gleason += seperator + matcher_score.group(2) + " + " + matcher_score.group(5) + " = " + matcher_score.group(8);
                        }
                        if(matcher_score.group(15) != null) {
                            gleason += seperator + matcher_score.group(17) + " + " + matcher_score.group(20) + " = " + matcher_score.group(15);
                        }
                        if(matcher_score.group(10) != null) {
                            gleason += seperator + matcher_score.group(10) + " + " + matcher_score.group(13) + " = " + (Integer.parseInt(matcher_score.group(10)) + Integer.parseInt(matcher_score.group(13)));
                        }
                        if(matcher_score.group(21) != null) {
                            gleason += seperator + matcher_score.group(21);
                        }
                        if(matcher_score.group(22) != null) {
                            gleason += seperator + convertRomanToArabicNumbers(matcher_score.group(21));
                        }
                        highlight += seperator + " #" + number_of_hits + ": " + matcher.start() + "-" + matcher.end() + "|" + matcher.group() + "|" + matcher_score.start() + "-" + matcher_score.end() + "|" + matcher_score.group() + "|";
                    }
                    counter++;
                }
                number_of_hits++;
                seperator = "; ";
            }

            if(number_of_hits > 0) {
                String query = "INSERT INTO prostate_saat.extracted_gleason( \n" +
                        "\t xml_report_befunddaten_id, gleason_score, number_of_gleason_scoures, highlight) \n" +
                        "\t VALUES (" + id + ", '" + gleason + "', " + number_of_hits + ", '" + highlight + "');";
                queries.add(query);
            }
        }
    }

    private Integer convertRomanToArabicNumbers(String romenNumber) {
        if(romenNumber.equals("I")) {
            return 1;
        }
        if(romenNumber.equals("II")) {
            return 2;
        }
        if(romenNumber.equals("III")) {
            return 3;
        }
        if(romenNumber.equals("IV")) {
            return 4;
        }
        if(romenNumber.equals("V")) {
            return 5;
        }
        if(romenNumber.equals("VI")) {
            return 6;
        }
        if(romenNumber.equals("VII")) {
            return 7;
        }
        if(romenNumber.equals("VIII")) {
            return 8;
        }
        if(romenNumber.equals("IX")) {
            return 9;
        }
        if(romenNumber.equals("X")) {
            return 10;
        }
        if(romenNumber.equals("XI")) {
            return 11;
        }
        if(romenNumber.equals("XII")) {
            return 12;
        }
        return -1;
    }

}
