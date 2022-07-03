package com.company;

public class Autor {
    private String firstName;
    private String lastName;

    public Autor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Autor: " + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}
