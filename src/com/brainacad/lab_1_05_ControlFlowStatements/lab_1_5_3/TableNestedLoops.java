package com.brainacad.lab_1_05_ControlFlowStatements.lab_1_5_3;

/**
 * Created by L.Pikalova on 09/04/2016.
 * Lab Work 1-5-3

 Goal:
    Getting a practical experience in
        Using loops.
 Task:
    Write a program to produce the multiplication table of 1 to 9 as shown
        using two nested for-loops:

 * |  1  2  3  4  5  6  7  8  9
 -------------------------------
 1 |  1  2  3  4  5  6  7  8  9
 2 |  2  4  6  8 10 12 14 16 18
 3 |  3  6  9 12 15 18 21 24 27
 4 |  4  8 12 16 20 24 28 32 36
 5 |  5 10 15 20 25 30 35 40 45
 6 |  6 12 18 24 30 36 42 48 54
 7 |  7 14 21 28 35 42 49 56 63
 8 |  8 16 24 32 40 48 56 64 72
 9 |  9 18 27 36 45 54 63 72 81

 Preparation:   No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how using for-loops
        how to print on console
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should two nested for-loops.
        - Student should use one System.out.println(...) statement for each line of outputs.
    Ask student to execute the program

 Evaluation:   the program must work correctly;
 Closure:      Issues discussion, on demand
 Reporting:     No special reporting
 */

public class TableNestedLoops {
    public static void main(String[] args) {

        System.out.print("*| ");
        for (int a = 1; a < 10; a++) {
            System.out.print(a + "  ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.print(i + "| ");
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
