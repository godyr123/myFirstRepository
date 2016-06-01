package org.taratser.model.database;

import org.taratser.connection.H2ConnectionManager;
import org.taratser.model.dto.LoanDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by taratser on 24.05.2016.
 */
public class LoanPersist {

    public static void save(LoanDTO loanDTO) throws SQLException {
        Connection conn = H2ConnectionManager.getConnection();
        Statement stmt = conn.createStatement();
        String sql = "INSERT INTO PERSONS";
    }
}
