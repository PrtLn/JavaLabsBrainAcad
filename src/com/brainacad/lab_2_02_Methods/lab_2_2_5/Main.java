package com.brainacad.lab_2_02_Methods.lab_2_2_5;

/**
 * Created by L.Pikalova on 10/3/2016.
 * Lab Work 2-2-5
 Goal
    Getting a practical experience in
        Writing simple console application, using overloaded methods and final argument
 Task
    Write class A with overridden methods calcSquare that calculate square of rectangle, square of foursquare and square of circle and print result.
    Write class that will use these methods.
    Write class with method that will take final integer and assign to it the square of this integer and print result.
    What will you get? Explain result.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to create and use overloaded methods
        how to use final arguments

 Execute following steps:
    Student should create a new blank Java Project in IDE.
    Student should create his or her own Java class and provide all necessary code in a method main()
    Student should use overloaded methods
    Student should understand how to use final arguments
    Ask student to execute the program

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        A square = new A();

        System.out.println("Square of rectangle is " + square.calcSquareRect(2.0, 3.0));
        System.out.println("Square of square is " + square.calcSquareSquare(5.0));
        System.out.println("Square of circle is " + square.calcSquareCircle(4.0));

    }
}
