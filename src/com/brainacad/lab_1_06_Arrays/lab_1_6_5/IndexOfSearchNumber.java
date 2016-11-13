package com.brainacad.lab_1_06_Arrays.lab_1_6_5;

/**
 * Created by L.Pikalova on 13.09.2016.
 * Lab Work 1-6-5
 Goal:
    Getting a practical experience in
        Writing simple console application, using 2d arrays.
 Task
    Write a program, which finds in a given matrix the area of equal numbers.
        Here is one example with an area containing 7 elements with equal value of 1:

            1*	1*	1*	3	 4
            2 	1*	3	 1*	2
            2	 2	 3	 4	 1*
            3	 3	 3 	1*	4

 The program must print to console:
            Line 1: [0-2]
            Line 2: [1,3]
            Line 3: [4]
            Line 4: [3]

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use 2d arrays
        how to use loops
    Execute following steps:
        Student should create a new blank Java Project in IDE.
        Student should create his or her own Java class and provide all necessary code in a method main()
        Student should use 2d arrays.
        Student should use System.out.println() to print to console.
    Ask student to execute the program

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class IndexOfSearchNumber {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 1, 1, 3, 4},
                {2, 1, 3, 1, 2},
                {2, 2, 3, 4, 1},
                {3, 3, 3, 1, 4}
        };
       
        int number = 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Line " + (i + 1) + " : [");
            for (int j = 0; j < arr[i].length; j++)
                if (arr[i][j] == number) {
                    System.out.print(j);
                }
            System.out.println("]");
        }
    }
}



