package org.taratser.model.database;

import org.junit.Test;
import org.taratser.model.dto.PersonDTO;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by taratser on 24.05.2016.
 */

public class PersonPersistTest {
    @Test
    public void testSavePerson() throws SQLException {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setPersonCode("111111-11111");
        personDTO.setName("John");
        personDTO.setSurname("Bush");
        System.out.println(personDTO);
        System.out.println("Starting save...");
        PersonPersist.save(personDTO);
        System.out.println("End save...");
    }

    @Test
    public void testGetPersons() throws SQLException {
        List<PersonDTO> personDTOList = PersonPersist.getList();
        for (PersonDTO personDTO : personDTOList) {
            System.out.println("personDTO = " + personDTO);
        }
    }
}
