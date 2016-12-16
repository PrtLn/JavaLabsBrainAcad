package com.brainacad.lab_1_04_Primitive_Types.lab_1_4_1;

/**
 * Created by Pikalova Lena on 03/09/2016.
 *
 * Lab Work 1-4-1
 Goal:
    Getting a practical experience in
        Declare and initialize local variables of primitive data types.

 Task:
    Write a console program prints on console each of the primitive data types
    (byte, short, int, long, float, double, char, boolean).

 Preparation:
    No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to declare and initialize local variables of primitive data
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should declare and initialize each of primitive data types.
        - Student should use one System.out.println(...) statement for each line of outputs.
    Ask student to execute the program

 Evaluation:     the program must work correctly;
 Closure:     Issues discussion, on demand
 Reporting:     No special reporting
 */

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        // The integer types
        byte bt = 111;
        short sht = 1131;
        int i = 11111;
        long lng = 101101001012L;

        //The float and double types
        float flt = 22.423F;
        double dbl = 263.154;

        // The char type
        char chr = 'p';

        // The boolean type
        boolean bln = true;

        System.out.println(bt);
        System.out.println(sht);
        System.out.println(i);
        System.out.println(lng);
        System.out.println(flt);
        System.out.println(dbl);
        System.out.println(chr);
        System.out.println(bln);
    }
}
