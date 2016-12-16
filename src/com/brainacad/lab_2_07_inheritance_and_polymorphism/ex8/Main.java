package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex8;

/**
 * Lab Work 2-7-8
 Goal
    Getting a practical experience in
    •	Using inheritance.
 Task
    Add to project  “MyShapes” a new class “Rectangle” which is a subclass of Shape.
        Add to class Rectangle a private field’s width and height (of double type).
        In class Rectangle override  calcArea() method which must return area of rectangle
            (By the formula:  area  = width* height).
        In class Rectangle override the toString() method. It must return string which contain name of shape, color and rectangle width and height. Example:
            “This is Rectangle, color: RED, width=11, height=22”
        Add to class Rectangle constructor with color , width and height arguments.

    Then add to class Main code to create one Rectangle object and print it name, color, width and height to console. Then invoke calcArea() method and print result to console.
        Program output must looks like:
            “This is Rectangle, color: RED, width=11, height=22”
            “Shape area is: 242”

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how to use inheritance;
    •	how to create class and override methods;
     Execute following steps:
    •	Create class Rectangle, subclass of Shape and provide all necessary code.
    •	Add code to class Main
    •	Student should execute program

 Evaluation	•	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("VIOLET", 5.5, 3.5);
        System.out.println(rectangle.toString());
        System.out.println("Rectangle area is: " + rectangle.calcArea());
    }
}
