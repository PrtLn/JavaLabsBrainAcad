package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex7;

/**
 * Lab Work 2-7-7
 Goal
    Getting a practical experience in
    •	Using inheritance.
 Task
    Add to project  “MyShapes” a new class “Circle” which is a subclass of Shape.
    Add to class Circle a private field “radius” (of double type).
        In class Circle override  calcArea() method which must return area of circle
            (by the formula:  area  = PI*radius2).
        In class Circle override the toString() method. It must return string which contain name of shape, color and radius of circle. Example:
            “This is Circle, color: GREEN, radius=22”
    Add to class Circle constructor with color and radius arguments.

    Then add to class Main code to create one Circle object and print it name color, and radius to console. Then invoke calcArea() method and print result to console.
    Program output must looks like:

            “This is Circle, color: GREEN, radius=10”
            “Shape area is: 314.15926”

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how to use inheritance;
    •	how to create class and override methods;
     Execute following steps:
    •	Create class Circle, subclass of Shape and provide all necessary code.
    •	Add code to class Main
    •	Student should execute program

 Evaluation	•	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("GREEN", 6.0);
        System.out.println(circle.toString());
        System.out.println("Circle area is: " + circle.calcArea());
    }
}
