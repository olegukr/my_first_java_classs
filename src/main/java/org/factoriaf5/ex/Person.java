package org.factoriaf5.ex;

import javax.xml.crypto.Data;

public class Person {

    private String firstName;
    private String lastName;
    private int id;
    private Data yearOfBirth;

    public Person(String firstName, String lastName, int id, Data yearOfBirth) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.yearOfBirth = yearOfBirth;
        
    }

}
