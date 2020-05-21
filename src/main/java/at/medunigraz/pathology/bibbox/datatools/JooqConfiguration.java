package at.medunigraz.pathology.bibbox.datatools;

import org.jooq.impl.DefaultConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JooqConfiguration {

    String url = "";
    String dbUser = "";
    String dbPasword = "";

    private JooqConfiguration() {

    }

    public Connection getJooqDBConnection() throws SQLException {
        return DriverManager.getConnection(url, dbUser, dbPasword);
    }
}
