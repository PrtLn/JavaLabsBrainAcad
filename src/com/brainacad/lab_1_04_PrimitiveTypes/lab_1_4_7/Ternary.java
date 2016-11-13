package com.brainacad.lab_1_04_PrimitiveTypes.lab_1_4_7;

/**
 * Created by Pikalova Lena on 03/09/2016.
 * Lab Work 1-4-7
 Goal:
    Getting a practical experience in
        Using Ternary operator.

 Task:
    Write a console program that prints result of Ternary operator
        for  integer variable initialization.

 Preparation:  No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to use ternary operator
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should declare and initialize integer variable depends of some boolean condition and print result to console
        - Student should use one System.out.println(...) statement for each line of outputs.
    Ask student to execute the program

 Evaluation: the program must work correctly;
 Closure: Issues discussion, on demand
 Reporting: No special reporting
 */

public class Ternary {

    public static void main(String[] args) {

        int a = 100;
        int b = 1000;
        int c = 10000;

        System.out.println(a > c ? b : a); // if a > c is true choose b
                                           // or
                                           // if this statement is false choose a
    }
}
