package com.brainacad.lab_2_04_StaticMethodsAndFields.lab_2_4_6;

/**
 * Created by L.Pikalova on 9/15/2016.
 * Lab Work 2-4-6

 Goal
    Getting a practical experience in
    	Using static field of class
 Task
    Write a class MyPyramid with public static method printPyramid(int h)
        that takes parameter an integer h between 1 and 9, and prints a pyramid of numbers of height h.
    Example: For h = 4 the method should print the pyramid

 1
 121
 12321
 1234321

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use static field
 Execute following steps:
    Student should create his or her own Java class and provide all necessary code in a method main()
    Ask student to execute the program

 Evaluation	 the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class MyPyramid {

    public static int h = 0;

    public static void printPyramid(int h) {

        for (int i = 0; i < h; i++) {

            for (int j = 0; j < h - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyPyramid.printPyramid(5);
    }

}

