package org.taratser.model.database;

import org.taratser.connection.H2ConnectionManager;
import org.taratser.model.dto.PersonDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by taratser on 24.05.2016.
 */
public class PersonPersist {

    public final static Connection conn = H2ConnectionManager.getConnection();

    public static void save(PersonDTO personDTO) throws SQLException {
        String sql = "INSERT INTO PERSONS (PERSON_CODE, NAME, SURNAME) VALUES (?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, personDTO.getPersonCode());
        pstmt.setString(2, personDTO.getName());
        pstmt.setString(3, personDTO.getSurname());
        pstmt.executeUpdate();
        pstmt.close();
        H2ConnectionManager.close();
    }

    public static List<PersonDTO> getList() throws SQLException {
        String sql = "SELECT * FROM PERSONS";
        Statement stmt = conn.createStatement();
        ResultSet rset = stmt.executeQuery(sql);
        ArrayList<PersonDTO> personDTOs = new ArrayList<PersonDTO>();
        while (rset.next()) {
            PersonDTO personDTO = new PersonDTO();
            personDTO.setPersonId(rset.getString("PERSON_ID"));
            personDTO.setPersonCode(rset.getString("PERSON_CODE"));
            personDTO.setName(rset.getString("NAME"));
            personDTO.setSurname(rset.getString("SURNAME"));
            personDTOs.add(personDTO);
        }
        rset.close();
        stmt.close();
        conn.close();
        return personDTOs;
    }
}
