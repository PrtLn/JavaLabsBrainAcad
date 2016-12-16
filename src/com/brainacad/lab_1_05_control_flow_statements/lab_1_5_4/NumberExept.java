package com.brainacad.lab_1_05_Control_Flow_Statements.lab_1_5_4;

/**
 * Created by L.Pikalova on 09/04/2016.
 * Lab Work 1-5-4
 Goal:
    Getting a practical experience in
        Writing simple console application, using nested loop end if-else construction.
 Task:
    The program must print the first 10 numbers that is divisible evenly by 3 or 4 , but the for loop iterates from 1 to 300.
        (so break statement must be used after 10 printed result).
    The output shall look:
             3
             4
             …
             20

 Preparation:    No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to use if-else statement
        how to use loops and nested loops
    Execute following steps:
        - Student should create a new blank Java Project in IDE.
        - Student should create his or her own Java class and provide all necessary code in a method main()
        - Student should use if-else statment and nested loop.
    Ask student to execute the program

 Evaluation:  the program must work correctly;
 Closure:     Issues discussion, on demand
 Reporting:   No special reporting
 */

public class NumberExept {
    public static void main(String[] args) {

        int a = 1;
        int counter = 0;

        for (int i = 0; i < 300; i++) {
            if (i == a * 3 || i == a * 4) {
                System.out.println(i);
                    a++;
                    counter++;
            } else if (counter == 10) {
                break;
            }
        }

        /*
        for (int i = 1, counter = 0; i < 300 *//* || counter < 10 *//*; i++) {
            if (counter >= 10) { break; } // comment line in case uncommenting for-condition
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                counter++;
            }
        }
        */
    }
}
