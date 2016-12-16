package com.brainacad.lab_1_05_Control_Flow_Statements.lab_1_5_1;

/**
 * Created by L.Pikalova on 03/09/2016.
 * Lab Work 1-5-1
 Goal:
    Getting a practical experience in
        -Writing simple console application, using standard output and nested loop.
 Task:
    Write a program to produce on console the following :
  
 1
 2  1
 3 2  1
 4 3 2  1
 5 4 3 2  1
 6 5 4 3 2  1
 7 6 5 4 3 2  1
 8 7 6 5 4 3 2  1

 Preparation:   No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to use loops and nested loops
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should use System.out.println() and loops.
    Ask student to execute the program

 Evaluation:   the program must work correctly;
 Closure:      Issues discussion, on demand
 Reporting:    No special reporting
 */

public class NestedLoops {
    public static void main(String[] args) {

// correct
        for (int i = 1; i < 9; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " "); // row
            }
            System.out.println();  // skip to new row
        }

/*// j increases
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println(i);
        }*/

/*// j is maximum and decreases, i increases
        for (int i = 1; i < 10; i++) {       // i -> columns
            for (int j = i; j < 9; j++) {     // j -> rows
                System.out.print(j + " ");
            }
            System.out.println();
        }*/
    }
}