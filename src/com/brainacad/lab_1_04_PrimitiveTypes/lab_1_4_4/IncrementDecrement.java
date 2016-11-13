package com.brainacad.lab_1_04_PrimitiveTypes.lab_1_4_4;

/**
 * Created by Pikalova Lena on 03/09/2016.
 * Lab Work 1-4-4
 Goal:
    Getting a practical experience in
        Using increment and decrement.

 Task:
    Write a console program that prints result of increment
        and decrement in prefix and postfix mode for integer variable.

 Preparation: No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to using increment and decrement
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should declare and initialize integer variable.
        - Student should apply increment and decrement in prefix and postfix mode and each time print variable value to console
        - Student should use one System.out.println(...) statement for each line of outputs.
    Ask student to execute the program

 Evaluation: the program must work correctly;
 Closure: Issues discussion, on demand
 Reporting: No special reporting
 */

public class IncrementDecrement {
    public static void main(String[] args) {

        int a = 10;
        int b = 100;

        int c = ++a; // the pre-increment operator
        int d = --a; // the pre-decrement operator

        int f = b++; // the post-increment operator
        int e = b--; // the post-decrement operator

        System.out.println("a = 10; b = 100");
        System.out.println();

        System.out.println("increment operator:");
        System.out.println("++a -> " + c);
        System.out.println("--a -> " + d);

        System.out.println();

        System.out.println("decrement operator:");
        System.out.println("b++ -> " + f);
        System.out.println("b-- -> " + e);
    }
}
