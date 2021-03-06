package com.brainacad.lab_1_04_Primitive_Types.lab_1_4_5;

/**
 * Created by Pikalova Lena on 03/09/2016.
 * Lab Work 1-4-5
 Goal:
    Getting a practical experience in
        Using Bit shift operators.

 Task:
    Write a console program that prints result of bit shift operators
        for integer variable.

 Preparation: No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to use a bit shift operators
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should declare and initialize two integer variables as same value.
        - Student should apply bit shift operators to first variable and divide
            or multiply (by power of two) arithmetic operators for second value, each time print result to console
        - Student should use one System.out.println(...) statement for each line of outputs.
    Ask student to execute the program

 Evaluation: the program must work correctly;
 Closure: Issues discussion, on demand
 Reporting: No special reporting
 */

public class BitShift {
    public static void main(String[] args) {
        int a = 100; // 01100100
        int b = 100; // 01100100

        // The left shift operator
        System.out.println(a << 2); // -> 0000000110010000 (256 + 128 + 16 = 400)

        // The divide operator
        System.out.println(b / 2);

        // The right shift operator
        System.out.println(a >> 2); // -> 0000000000011001 (16 + 8 + 1 = 25)

        // The multiply operator
        System.out.println(b * 2);
    }
}
