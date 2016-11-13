package com.brainacad.lab_1_04_PrimitiveTypes.lab_1_4_6;

/**
 * Created by Pikalova Lena on 03/09/2016.
 * Lab Work 1-4-6
 Goal:
    Getting a practical experience in
        Using Bitwise operators.

 Task:
    Write a console program that prints result of Bitwise operators
        for two integer variables.

 Preparation: No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to using bitwise operators
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should declare and initialize two integer variables.
        - Student should apply each of Bitwise operators declared variables and time print result to console
        - Student should use one System.out.println(...) statement for each line of outputs.
    Ask student to execute the program

 Evaluation: the program must work correctly;
 Closure: Issues discussion, on demand
 Reporting: No special reporting
 */

public class Bitwise {

    public static void main(String[] args) {

        int a = 102; // 0000000001100110 = 102
        int b = 201; // 0000000011001001 = 201

        // AND
        System.out.println(a & b); //0000000001000000 = 64

        // OR
        System.out.println(b | a); //0000000011101111 = 239

        // XOR
        System.out.println(a ^ b); //0000000010101111 = 175

        // NOT
        System.out.println(~a);    //0000000010011001 = (?)
    }
}
