package com.brainacad.lab_2_05_Initialization_Sections.ex4;

/**
 * Lab Work 2-5-4
 Goal
    Getting a practical experience in
        Using static initialization block.
 Task
    Change MyInit class:
        Change initialization block to static initialization block.
    Compile end run. What will you see and why?

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use static initialization block

 Execute following steps:
    Student should modify class for using static initialization block

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class MyInit {

    private static int[] arr;                   // static field

    static {                                    // static block
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (100 * Math.random());
        }
    }

    public void printArray() {

        for (int number : arr) {
            System.out.print(number + " ");
        }
    }
}
