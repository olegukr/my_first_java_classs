package org.factoriaf5.ex;

public class Person {

    private String firstName;
    private String lastName;
    private int id;
    private String yearOfBirth;

    public Person(String firstName, String lastName, int id, String yearOfBirth) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.yearOfBirth = yearOfBirth;
        
    }

    public void outputAllAttributes() {
        System.out.println("-".repeat(40));
        System.out.println("ID: " + this.id);
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Year of birth: " + this.yearOfBirth);


    }

}
