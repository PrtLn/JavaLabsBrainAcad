package com.brainacad.lab_1_06_Arrays.lab_1_6_3;

/**
 * Created by L.Pikalova on 08.09.2016.
 * Lab Work 1-6-3
 Goal:
    Getting a practical experience in
        Writing simple console application, using 2-dimensional arrays.
 Task:
        1	5	9	13
        2	6	10	14
        3	7	11	15
        4	8	12	16

        Write a program, which creates square matrix like those in the figure below 
            and prints them formatted to the console. The size of the matrix is 4 x 4:

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to initialize and use 2-dimensional arrays
        how to use loops
    Execute following steps:
        Student should create a new blank Java Project in IDE.
        Student should create his or her own Java class and provide all necessary code in a method main()
        Student should use 2d arrays and loop.
     Ask student to execute the program

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class TwoDimentionalArray {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        for (int it = 0; it < matrix.length; it++) {
            for (int jt = 0; jt < matrix.length; jt++) {

                System.out.print(matrix[jt][it] + "  ");
            }
            System.out.println();
        }
    }
}