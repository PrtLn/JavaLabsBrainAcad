package com.brainacad.lab_2_05_Initialization_Sections.ex5;

/**
 * Lab Work 2-5-5
 Goal
    Getting a practical experience in
        Writing simple class with static and non-static initialization block.
 Task
    Write class InitTest with private field “id” of int type and static private field “nextId” of integer;
    Write code that:
        Initialize static field “nextId” of some random value (in 1 … 1000 range) once when class loaded to JVM;
        Increments  static field “nextId” each time when new instance of InitTest created;
        Initialize field “id” of “nextId” field value each time when new instance of InitTest created.
    And method getId() which will return value of id.
    Create class Main, which will create five instances of class InitTest and invokes method “getId()” on each instance and print returned value on console.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to create simple class
        how to create static and  non-static initialization block

 Execute following steps:
    Student should create a new blank Java Project in IDE.
    Student should create Java class with static field, instance field and methods.
    Student should create static and  non-static initialization block.
    Ask student to execute the program

 Evaluation	No special evaluation
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class InitTest {

    private int id;

    private static int nextId;

    static {
        nextId = (int) (1000 * Math.random());
    }

    public int getId() {
        return id;
    }

    {
        nextId++;
        id = nextId;
    }
}
