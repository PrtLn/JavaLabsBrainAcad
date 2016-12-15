package com.brainacad.lab_2_08_AbstractClassesAndInterfaces.ex2;

/**
 * Created by L.Pikalova on 10/3/2016.
 * Lab Work 2-8-2
 Goal
    Getting a practical experience in
        Using inheritance and interfaces.
 Task
    Add to project  “MyShapes” a new  interface called “Drawable”, with abstract method draw().
    The draw() method has no arguments and does not return a value.
    Implement  interface Drawable to class Shape.
    The classes that implements the Drawable interface will provide actual implementation
        to these abstract method witch print characteristics of each shape on console
        (print to console information about this object from toString() and area of this shape (using “calcArea()” method).
    Add code to main() method in class Main to iterate over shapes array in loop (use for-each loop) and invoke draw() method.
    Execute the program, output must looks like:

        This is Rectangle, color: RED, width=11, height=22,  area is: 242
        This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825
        This is Circle, color: GREEN, radius=10, area is: 314.15926

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use inheritance;
        how to create interface and implement method;

 Execute following steps:
        Create interface Drawable, provide all necessary code in class of Shape.
        Add code to class Main
        Student should execute program

 Evaluation	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle("WHITE", 4.0, 9.0);
        Rectangle rect2 = new Rectangle("GRAY", 8.2, 3.6);
        Circle circle = new Circle("RED", 10.0);
        Triangle trngl1 = new Triangle("BLACK", 2.0, 3.0, 4.0);
        Triangle trngl2 = new Triangle("ORANGE", 5.0, 10.0, 15.0);

        Shape[] arr = new Shape[]{rect1, rect2, circle, trngl1, trngl2};
        for (Shape sh : arr) {
            sh.draw();
        }
    }
}
