package at.medunigraz.pathology.bibbox.datatools.prostate;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractSamenblasenInvationInformation {
    private String pg_url = "jdbc:postgresql://127.0.0.1:5432/saat";
    private String pg_user = "saat";
    private String pg_password = "fenris";

    Pattern pattern = Pattern.compile("[\\s*|\\w*|,|\\(|\\)]*SAMEN\\w*[\\s*|\\w*|,|\\(|\\)]*", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);

    private String query = "SELECT cases.vhistonumberid vhistonumberid, MAX(\"DIAGNOSE1\") diagnosis, MAX(\"MAKROSKOPISCHEBESCHREIBUNG1\") makroskopischebeschreibung, " +
            "MAX(\"HISTOLOGISCHEBESCHREIBUNG1\") histologischebeschreibung " +
            ", MAX(\"MIKROSKOPISCHEBESCHREIBUNG1\") mikroskopischebeschreibung, MAX(\"SCHNELLSCHNITTDIAGNOSE1\") schnellschnittdiagnose " +
            "FROM scannerwebserviceproductive.scantable scan " +
            "JOIN scannerwebserviceproductive.slidetable slide ON scan.slidebarcode = slide.slidebarcode " +
            "JOIN scannerwebserviceproductive.histonumbervhistonumbermap hito ON hito.histonumber_fk = slide.slidehistonumber " +
            "JOIN scannerwebserviceproductive.casetable cases ON cases.vhistonumberid = hito.vhistonumberid_fk " +
            "JOIN prostate.xml_report_befunddaten befund ON befund.\"VHISTID1_ext\" = cases.vhistonumberid " +
            "WHERE \"MAKROSKOPISCHEBESCHREIBUNG1\" ILIKE '%SAMEN%' OR " +
            "\t\"HISTOLOGISCHEBESCHREIBUNG1\" ILIKE '%SAMEN%' OR " +
            "\t\"MIKROSKOPISCHEBESCHREIBUNG1\" ILIKE '%SAMEN%' OR " +
            "\t\"SCHNELLSCHNITTDIAGNOSE1\" ILIKE '%SAMEN%' OR " +
            "\t\"DIAGNOSE1\" ILIKE '%SAMEN%' " +
            "GROUP BY cases.vhistonumberid;";

    public void extractInformation() {
        try(Connection connection = DriverManager.getConnection(pg_url, pg_user, pg_password)) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            workExtraction(resultSet);
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }

    private void workExtraction(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            Long id = resultSet.getLong("vhistonumberid");
            String diagnosis = resultSet.getString("diagnosis").replaceAll("[\\t\\n\\r]+", " ");
            String makroskopischebeschreibung = resultSet.getString("makroskopischebeschreibung");
            String histologischebeschreibung = resultSet.getString("histologischebeschreibung");
            String mikroskopischebeschreibung = resultSet.getString("mikroskopischebeschreibung");
            String schnellschnittdiagnose = resultSet.getString("schnellschnittdiagnose");

            System.out.println("-----------------");
            System.out.println(id);
            //System.out.println(diagnosis);
            matchDataString(diagnosis);
            matchDataString(makroskopischebeschreibung);
            matchDataString(histologischebeschreibung);
            matchDataString(mikroskopischebeschreibung);
            matchDataString(schnellschnittdiagnose);

        }
    }

    private void matchDataString(String datastirng) {
        Matcher matcher = pattern.matcher(datastirng);
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
        }
    }
}
