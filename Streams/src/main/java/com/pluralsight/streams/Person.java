package com.pluralsight.streams;

// The Person class represents an individual with first name, last name, and age
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Override toString() to display person information
    @Override
    public String toString() {
        return firstName + " " + lastName + ", Age: " + age;
    }
}
