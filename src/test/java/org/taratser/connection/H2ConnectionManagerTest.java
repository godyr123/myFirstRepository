package org.taratser.connection;

import static org.taratser.connection.H2ConnectionManager.getConnection;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;


/**
 * Created by taratser on 17.05.2016.
 */
public class H2ConnectionManagerTest {
    @Test
    public void tryConnectToDataBase() throws SQLException {
        Connection connection = getConnection();
        assertNotNull(connection);
        System.out.println("connection.getMetaData() = " + connection.getMetaData());
        System.out.println("Starting to close connections...");
        H2ConnectionManager.close();
    }
}

