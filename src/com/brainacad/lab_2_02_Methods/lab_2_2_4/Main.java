package com.brainacad.lab_2_02_Methods.lab_2_2_4;

/**
 * Created by L.Pikalova on 10/3/2016.
 * Lab Work 2-2-4

 Goal
    Getting a practical experience in
        Writing simple console application, using overloaded methods
 Task
    Create class Person with fields firstName(String), lastName(String), age(int), gender(String), phoneNumber(int),
        and  five overloaded methods that set this fields with different arguments list.
    And create class that will be use instance of class Person and his methods.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to create and use overloaded methods
        how to use create instance of class

 Execute following steps:
    Student should create a new blank Java Project in IDE.
    Student should create his or her own Java class and provide all necessary code in a method main()
    Ask student to execute the program

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.setValue(21);
        person.setValue(33, "Sam");
        person.setValue(23, "Tom", "Smith");
        person.setValue(22, "Marie", "Blacksmith", "woman");
        person.setValue(20, "Garry", "Stone", "man", 2223355);

    }
}
