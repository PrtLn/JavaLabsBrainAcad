package com.brainacad.lab_2_05_Initialization_Sections.ex1;

/**
 * Lab Work 2-5-1
 Goal
    Getting a practical experience in
        Using initialization blocks, static initialization blocks and constructors.
 Task
    Create class “MyInitTest” with two initialization blocks, two static initialization blocks and two constructors (one constructor() must invoke second constructor(int)).
    On each block write code that prints on console type of block and block number.

    For example:
        “static initialization block 1”
        “static initialization block 2”
        “non-static initialization block 1”
        “non-static initialization block 2”
        “constructor 1”
        “constructor 2”

    Create class Main, which will create instance of class MyInitTest by invoking first constructor.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use initialization blocks

 Execute following steps:
    Student should modify class field to static
    Student should create Java class and provide all necessary code in a class.

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class MyInitTest {

    static {
        System.out.println("static initialization block 1");
    }

    static {
        System.out.println("static initialization block 2");
    }

    {
        System.out.println("non-static initialization block 1");
    }

    {
        System.out.println("non-static initialization block 2");
    }

    public MyInitTest() {
        System.out.println("constructor 1");
    }

    public MyInitTest(int i) {
        this();
        System.out.println("constructor 2");
    }

    public static void main(String[] args) {

        MyInitTest invoke = new MyInitTest(1);
    }
}
