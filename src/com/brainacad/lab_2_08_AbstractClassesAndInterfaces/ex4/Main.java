package com.brainacad.lab_2_08_AbstractClassesAndInterfaces.ex4;

import java.util.Arrays;

/**
 * Created by L.Pikalova on 10/3/2016.
 * Lab Work 2-8-4
 Goal
    Getting a practical experience in
        Using inheritance and interfaces.
 Task
    Add code to main() method in class Main to create array (Rectangle[] arr2) of six Rectangle objects and sort it using Arrays.sort() method.
    Add code to main() method in class Main to iterate over Rectangles array in loop (use for-each loop) and invoke draw() method.

 Execute the program, output must looks like:
        This is Rectangle, color: RED, width=10, height=10,  area is: 100
        This is Rectangle, color: RED, width=11, height=22,  area is: 242
        This is Rectangle, color: RED, width=100, height=5,  area is: 500
        …

 No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to sort arrays;

 Execute following steps:
    Add code to class Main
    Student should execute program

 Evaluation	No special evaluation
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Rectangle[] arr2 = {
                new Rectangle("WHITE", 10, 10),
                new Rectangle("YELLOW", 11, 22),
                new Rectangle("ORANGE", 12, 15),
                new Rectangle("RED", 5, 20),
                new Rectangle("BLUE", 17, 34),
                new Rectangle("GREEN", 2, 10)};

        for (Shape sh : arr2) {
            sh.draw();
        }
        System.out.println();

        System.out.println("Sorting of rectangles:");
        Arrays.sort(arr2);
        for (Shape sh : arr2) {
            sh.draw();
        }
    }
}
