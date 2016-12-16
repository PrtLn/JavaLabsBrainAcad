package com.brainacad.lab_2_08_Abstract_Classes_and_Interfaces.ex1;

/**
 * Lab Work 2-8-1
 Goal
    Getting a practical experience in
        Using inheritance and abstract class.
 Task
    Open project MyShapes. (from 2.7 labs)
    Rewrite the class “Shape” to make it abstract and change calcArea() method declaration to make it abstract too.
    Execute program

 Preparation	No special preparation
 Execution\ methodology
    Remind that student should apply his or her knowledge of:
        how to create class and override toString() method;

 Execute following steps:
    Student should change Java class Shape to make it abstract.
    Student should execute program

 Evaluation	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape("RED") {
            @Override
            public double calcArea() {
                return area;
            }
        };

        System.out.println(shape);
    }
}
