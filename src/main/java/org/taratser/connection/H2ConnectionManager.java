package org.taratser.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by taratser on 17.05.2016.
 */
public final class H2ConnectionManager {
    private final static String h2DBName = "jdbc:h2:./database/mytestdb";
    private final static String h2DBLogin = "sa";
    private static Connection conn;

    static {
        try {
            if (conn == null)
                conn = DriverManager.getConnection(h2DBName, h2DBLogin, "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return conn;
    }
    public static void close() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
