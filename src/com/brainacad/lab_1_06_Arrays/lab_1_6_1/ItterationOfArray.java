package com.brainacad.lab_1_06_Arrays.lab_1_6_1;

/**
 * Created by L.Pikalova on 08.09.2016.
 *
 * Lab Work 1-6-1
 Goal:
    Getting a practical experience in
        Writing simple console application, using array end nested loop.
 Task:
    Create an array of all the even numbers from 2 to 30 (2,4,6...30) and display elements of the array to the screen.

 Preparation:	No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to use loops and arrays
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should use array and nested loop.
    Ask student to execute the program

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class ItterationOfArray {
    public static void main(String[] args) {

        int[] array = new int[30];
        int i = 2;

        for (array[i] = 0; i <= 29; i++) {
            System.out.print(i + ", ");
        }
        System.out.print(i);
    }
}
