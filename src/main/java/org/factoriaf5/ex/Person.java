package org.factoriaf5.ex;

public class Person {

    private String firstName;
    private String lastName;
    private int id;
    private String yearOfBirth;
    private String countryOfBirth;
    private char gender;

    public Person(
        String firstName, 
        String lastName, 
        int id, 
        String yearOfBirth,
        String countryOfBirth,
        char gender) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.yearOfBirth = yearOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
    }

    public void outputAllAttributes() {
        System.out.println("-".repeat(40));
        System.out.println("ID: " + this.id);
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Year of birth: " + this.yearOfBirth);
        System.out.println("Country of birth: " + this.countryOfBirth);
        System.out.println("Gender: " + this.gender);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public char getGender() {
        return gender;
    }

}
