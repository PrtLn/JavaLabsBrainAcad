package com.brainacad.lab_1_05_Control_Flow_Statements.lab_1_5_2;

import java.util.Scanner;

/**
 * Created by L.Pikalova on 09/04/2016.
 * Lab Work 1-5-2
 Goal:
    Getting a practical experience in
        Writing simple console application, using "nested-if" statement , "switch-case" statement .
 Task:
    - Write a program which prompts user for the number "X", reads it from the keyboard, and saves it in an int variable called "x".
    - Then prints "One", "Two",... , "Nine" if the int variable "x" is 1, 2,... , 9  and "Other" if “x” >9, respectively.
    - Use (a) a "nested-if" statement;
    -     (b) a "switch-case" statement.
    - The output shall look like (user input – in green):
             - Enter number x: 1	    - Enter number x: 12
             - One					    - Other

 Preparation:    No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to use "nested-if" statement , "switch-case" statement
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should use System.in and Scanner class to read x value from console
        - Student should use
                (a) "nested-if" statement or
                (b)  "switch-case" statement
        - Student should use System.out.println().
    Ask student to execute the program

 Evaluation:  the program must work correctly;
 Closure:     Issues discussion, on demand
 Reporting:   No special reporting
 */

public class GuessNumberIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number:" + "\n");

        int num = sc.nextInt();
        String line;

        switch (num) {
            case 1: line = "One";
                break;
            case 2: line = "Two";
                break;
            case 3: line = "Three";
                break;
            case 4: line = "Four";
                break;
            case 5: line = "Five";
                break;
            case 6: line = "Six";
                break;
            case 7: line = "Seven";
                break;
            case 8: line = "Eight";
                break;
            case 9: line = "Nine";
                break;
            default: line = "Other";
                break;
        }
        System.out.println(line);
    }
}
