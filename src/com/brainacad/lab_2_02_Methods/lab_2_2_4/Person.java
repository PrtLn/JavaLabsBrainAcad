package com.brainacad.lab_2_02_Methods.lab_2_2_4;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;

    public void setValue(int age) {
        System.out.println("Data about Person are age: " + age);
    }
    public void setValue(int age, String firstName) {
        System.out.println("Data about Person are age: " + age + ", first name: " + firstName);
    }
    public void setValue(int age, String firstName, String lastName) {
        System.out.println("Data about Person are age: " + age + ", first name: " + firstName + ", last name: " + lastName);
    }
    public void setValue(int age, String firstName, String lastName,
                         String gender) {
        System.out.println("Data about Person are age: " + age + ", first name: " + firstName + ", last name: " + lastName + ", gender: " + gender);
    }
    public void setValue(int age, String firstName, String lastName,
                         String gender, int phoneNumber) {
        System.out.println("Data about Person are age: " + age + ", first name: " + firstName + ", last name: " + lastName + ", gender: " + gender + ", phone number: " + phoneNumber);
    }
}
