package com.brainacad.lab_1_04_PrimitiveTypes.lab_1_4_8;

/**
 * Created by Pikalova Lena on 03/09/2016.
 * Lab Work 1-4-8
 Goal:
    Getting a practical experience in
        Using Type casting.

 Task:
    Write a console program that prints result type casting
        for different primitive types.

 Preparation: No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to use type casting
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should declare and initialize several primitive variables and try to cast to another primitive type variable.
        - Student should use one System.out.println(...) statement for each line of outputs.
    Ask student to execute the program

 Evaluation: the program must work correctly;
 Closure: Issues discussion, on demand
 Reporting: No special reporting
 */

public class Casting {
    public static void main(String[] args) {

        long lng = 3333334287333L;
        float flt = 256.5487656F;
        double dbl = 24678.358906;

        // int b = lng; // wrong
        // System.out.println(b); // wrong

        int a = (int) lng;  // (?)
        System.out.println(a);

        int b = (int) flt;
        System.out.println(b);

        float c = (float) dbl;
        System.out.println(c);

        double d = (double) flt; // (?)
        System.out.println(d);
    }
}
