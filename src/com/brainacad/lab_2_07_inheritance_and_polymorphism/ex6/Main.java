package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex6;

/**
 * Lab Work 2-7-6
 Goal
    Getting a practical experience in
    •	Using inheritance.
 Task
    Create new project named MyShapes. Add package “com.brainacad.oop.testshapes”.
        You should design a super class “Shape”, which defines the public method of all the shapes called calcArea(),
        which returns the area (double type) of that particular shape.
        (Our program uses many kinds of shapes, such as triangle, rectangle and so on.)
    Define a Shape class as:
        public class Shape {
            //declare private instance variable “shapeColor” of String type
            // create a constructor for Shape with shapeColor parameter
            // Override  toString() to return the string of Shape name and color, example:
            “Shape, color is: RED”
            // All shapes must has a method called calcArea (),
            write public method (empty)  calcArea ¬that returns double value ( 0.0 ) .
        }
    Create class Main with method main().
        The program must demonstrate the creation of one Shape object and print it name and color to console.
        Then add code to invoke calcArea() method and print result to console.
        Program output must looks like:
            “This is Shape, color is: RED”
            “Shape area is: 0”

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how to create class and override toString() method;
    Execute following steps:
    •	Student should create a new blank Java Project in IDE.
    •	Student should create Java class Shape and provide all necessary code.
    •	Student should create Java class Main and provide all necessary code.
    •	Student should execute program

 Evaluation	•	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {

    public static void main(String[] args) {

        Shape shape = new Shape("RED");
        System.out.println(shape.toString());

        Triangle triangle = new Triangle("BLUE");
        System.out.println(triangle.toString());

        Square square = new Square("BLACK");
        System.out.println(square.toString());
    }
}
