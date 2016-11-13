package com.brainacad.lab_1_05_ControlFlowStatements.lab_1_5_5;

/**
 * Created by L.Pikalova on 09/04/2016.
 * Lab Work 1-5-5
 Goal:
    Getting a practical experience in
        Writing simple console application, using loop and  arithmetic operators.
 Task:
    Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.
        Also compute and display the average. The output shall look like:
            The Sum is: 100
            The Avg is: 10

 Preparation:   No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to use loops
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should use loop and arithmetic operators.
    Ask student to execute the program

 Evaluation:   the program must work correctly;
 Closure:      Issues discussion, on demand
 Reporting:    No special reporting
 */

public class SumAndAverage {
    public static void main(String[] args) {

        int sum = 0;
        int avg;
        int i;
        int n = 0;

        for (i = 0; i <= 100; i++) {
            sum += i;
            n++;
            if (sum == 10 * n) {
                break;
            }
        }
        avg = sum / i;

        System.out.println("The Sum is: " + sum);
        System.out.println("The Average is: " + avg);

        /*
        System.out.println("Input upper bound N:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        float avg;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        avg = sum / (float) n;

        System.out.println("The Sum is: " + sum);
        System.out.println("The Avg is: " + avg);
        */
    }
}
