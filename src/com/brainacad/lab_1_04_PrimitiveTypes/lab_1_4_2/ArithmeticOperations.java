package com.brainacad.lab_1_04_PrimitiveTypes.lab_1_4_2;

/**
 * Created by Pikalova Lena on 03/09/2016.
 *
 * Lab Work 1-4-2
 Goal:
    Getting a practical experience in
        Using arithmetic operators.

 Task:
    Write a console program that prints result of each of arithmetic operations
        (+, -, /, *, %) for two variables of primitive data types.

 Preparation: No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to using arithmetic operators
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should declare and initialize two integer variables of primitive data types.
        - Student should apply each of arithmetic operations  and print result to console
        - Student should use one System.out.println(...) statement for each line of outputs.
    Ask student to execute the program

 Evaluation:   the program must work correctly;
 Closure:   Issues discussion, on demand
 Reporting:    No special reporting
 */

public class ArithmeticOperations {
    public static void main(String[] args) {

        int a = 100;
        int b = 10;
        int c = 5;
        int d = 3;

        System.out.println(a + b); // Additive operator
        System.out.println(b - c); // Subtraction operator
        System.out.println(a / d); // Division operator
        System.out.println(a * c); // Multiplication operator
        System.out.println(b % d); // Remainder operator
    }
}
