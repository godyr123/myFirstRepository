package org.taratser.model.dto;

import java.util.Map;
import java.util.Set;

/**
 * Created by taratser on 24.05.2016.
 */
public class PersonDTO {

    public void setValues(Set<Map.Entry<String, String[]>> entrySet) {
        for (Map.Entry<String, String[]> entry: entrySet) {
            String key = entry.getKey();
            String[] value = entry.getValue();
            System.out.println("key = " + key + " value = " + value[0]);
            if (FieldNames.personId.equals(key)) {
                this.setPersonId(value[0]);
            }
            if (FieldNames.personCode.equals(key)) {
                this.setPersonCode(value[0]);
            }
            if (FieldNames.name.equals(key)) {
                this.setName(value[0]);
            }
            if (FieldNames.surname.equals(key)) {
                this.setSurname(value[0]);
            }
        }
    }

    static class FieldNames {
        public static final String personId = "personId";
        public static final String personCode = "personCode";
        public static final String name = "name";
        public static final String surname = "surname";
    }

    private String personId;
    private String personCode;
    private String name;
    private String surname;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonCode() {
        return personCode;
    }

    public void setPersonCode(String personCode) {
        this.personCode = personCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "personId='" + personId + '\'' +
                ", personCode='" + personCode + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
