package com.brainacad.lab_2_07_InheritanceAndPolymorphism.ex9;

/**
 * Lab Work 2-7-9
 Goal
    Getting a practical experience in
    •	Using inheritance.
 Task
    Add to project  “MyShapes” a new class “Triangle” which is a subclass of Shape.
    Add to class Triangle a private field’s a, b, c (of double type) which is sides of triangle.
    In class Triangle override  calcArea() method which must return area of triangle
        (By the formula:  area  =  , where  ).
    In class Triangle override the toString() method. It must return string which contain name of shape, color and a, b, c sides of triangle. Example:
        “This is Triangle, color: BLACK, a=5, b=5, c=5”
    Add to class Triangle constructor with color, a, b and c arguments.

    Then add to class Main code to create one Triangle object and print it name, color, a, b, c sides of triangle to console. Then invoke calcArea() method and print result to console.
        Program output must looks like:
            “This is Triangle, color: BLACK, a=5, b=5, c=5”
            “Shape area is: 10.825”

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how to use inheritance;
    •	how to create class and override methods;
 Execute following steps:
    •	Create class Triangle, subclass of Shape and provide all necessary code.
    •	Add code to class Main
    •	Student should execute program
 Evaluation	No special evaluation
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle("BLACK", 5.0, 5.0, 5.0);
        System.out.println(triangle.toString());
        System.out.println("Triangle area is: " + triangle.calcArea());
    }
}
