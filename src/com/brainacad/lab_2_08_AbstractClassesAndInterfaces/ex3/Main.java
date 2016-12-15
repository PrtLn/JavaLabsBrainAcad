package com.brainacad.lab_2_08_AbstractClassesAndInterfaces.ex3;

/**
 * Created by L.Pikalova on 10/3/2016.
 * Lab Work 2-8-3
 Goal
    Getting a practical experience in
        Using inheritance and interfaces.
 Task
    You must implement the Comparable interface to each of shape types (Rectangle, Circle, Triangle).
        Implement the compareTo method for each of shape types class so that it compares the areas of the shapes.
    Create two different Rectangle instances and compare it to each other. Print result to console.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use inheritance;
        how to implement  interface;

 Execute following steps:
    Change class Rectangle and provide all necessary code.
    Add code to class Main
    Student should execute program

 Evaluation	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle("BLACK", 6.0, 11.0);
        Rectangle rect2 = new Rectangle("WHITE", 13.2, 8.6);

        rect1.draw();
        rect2.draw();

        if (rect1.compareTo(rect2) > 0) {
            System.out.println("First rectangle area bigger than second rectangle area");
        } else if (rect1.compareTo(rect2) < 0){
            System.out.println("First rectangle area less than second rectangle area");
        } else {
            System.out.println("First rectangle equals second rectangle area");
        }
    }
}
