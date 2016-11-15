package com.brainacad.lab_2_05_InitializationSections.ex3;

/**
 * Lab Work 2-5-3
 Goal
    Getting a practical experience in
        Using initialization block.
 Task
    Change MyInit class:
        change MyInit field “arr” to static field.
    Compile end run. What will you see and why?

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use initialization block

 Execute following steps:
    Student should modify class field to static

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class MyInit {

    private static int[] arr;                   // static field

    {                                           // non-static block
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
