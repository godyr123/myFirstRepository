package org.taratser.model.dto;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/**
 * Created by taratser on 24.05.2016.
 */

public class LoanDTO implements Serializable{
    public void setValues(Set<Map.Entry<String, String[]>> entrySet) {
        for (Map.Entry<String, String[]> entry: entrySet) {
            String key = entry.getKey();
            String[] value = entry.getValue();
            System.out.println("key = " + key + " value = " + value[0]);
            if (FieldNames.personId.equals(key)) {
                this.setPersonId(value[0]);
            }
            if (FieldNames.term.equals(key)) {
                this.setTerm(value[0]);
            }
            if (FieldNames.amount.equals(key)) {
                this.setAmount(value[0]);
            }
        }
    }

    private static class FieldNames {
        public static final String personId = "personId";
        public static final String term = "term";
        public static final String amount = "amount";
    }
    private String personId;
    private String term;
    private String amount;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "LoanDTO{" +
                "personId='" + personId + '\'' +
                ", term='" + term + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
