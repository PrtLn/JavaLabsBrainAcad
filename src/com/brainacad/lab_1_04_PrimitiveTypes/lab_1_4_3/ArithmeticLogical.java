package com.brainacad.lab_1_04_PrimitiveTypes.lab_1_4_3;

/**
 * Created by Pikalova Lena on 03/09/2016.
 * Lab Work 1-4-3
 Goal:
    Getting a practical experience in
        Using logical operators.

 Task:
    Write a console program that prints result of each of arithmetic logical
        (AND,OR,NOT,XOR) for two variables of boolean data type.

 Preparation: No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to using logical operators
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should declare and initialize two variables of boolean data type.
        - Student should apply each of logical operations and print result to console
        - Student should use one System.out.println(...) statement for each line of outputs.
    Ask student to execute the program

 Evaluation: the program must work correctly;
 Closure: Issues discussion, on demand
 Reporting: No special reporting
 */

public class ArithmeticLogical {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println(a | b);  // the OR operator
        System.out.println(b & a);  // the AND operator
        System.out.println(a ^ b);  // the XOR operator
        System.out.println(!b);      // the NOT operator (unary)

    }
}
