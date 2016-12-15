package com.brainacad.lab_2_07_InheritanceAndPolymorphism.ex10;

/**
 * Lab Work 2-7-10
 Goal
    Getting a practical experience in
    •	Using inheritance
    •	Using polymorphism
 Task
    Use “MyShapes” project. The program must demonstrate the creation of an array of different types of shapes and print characteristics of each shape on console.
        1.	Add new code to method main() in class Main:
        2.	Create array (Shape[] arr) of different Shapes objects, (five  rectangles, two circles and two triangles);
        3.	Add code to iterate over shapes array in loop (use for-each loop) and print characteristics of each shape on console
                (using “toString()” method) with area of this shape (using “calcArea()” method).
        4.	Execute the program, output must looks like:
                This is Rectangle, color: RED, width=11, height=22,  area is: 242
                This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825
                This is Circle, color: GREEN, radius=10, area is: 314.15926
        5.	Add code to calculate total area of all shape types. Define “sumArea” (of double type) local variable and use it in loop to sum total area for all shapes.
        6.	Add code to sum total area for each shape types. Define “sumRectArea”, “sumTriangleArea”, “sumCircleArea” (of double type) local variables and use it in loop to sum total area for each shape type. You should use instanceof keyword for determining, total area for each of shape types (Rectangle, Circle, Triangle) and print it to console.
        7.	Execute the program, output must looks like:
                Rectangles total area: 234.54
                Circle total area: 547.231
                Triangle total area: 356.56

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how to use inheritance
    •	how to use polymorphism

 Execute following steps:
    •	Student should provide all necessary code in a method main()
 Evaluation	•	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle("WHITE", 4.0, 9.0);
        Rectangle rect2 = new Rectangle("GRAY", 8.2, 3.6);
        Circle circle = new Circle("GREEN", 10.0);
        Triangle trngl1 = new Triangle("BLACK", 2.0, 3.0, 4.0);
        Triangle trngl2 = new Triangle("BLACK", 5.0, 10.0, 15.0);

        Shape[] arr = new Shape[]{rect1, rect2, circle, trngl1, trngl2};
        for (Shape shape : arr) {
            System.out.print(shape);
            System.out.println(", area is " + shape.calcArea());
        }
    }
}
