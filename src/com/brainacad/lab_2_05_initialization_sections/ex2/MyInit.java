package com.brainacad.lab_2_05_Initialization_Sections.ex2;

/**
 * Lab Work 2-5-2
 Goal
    Getting a practical experience in
    Writing simple class with non-static initialization block.
 Task
    Create class “MyInit” with field “arr” of array of integers and non-static initialization block
        which will initialize that array with random values. (Size of array is 10)
    To generate random numbers you can use next code:
        arr[i]= (int) (100 * Math.random()).
    (Or using Random class instance and nextInt() method invocation).
    Add to class MyInit and method “printArray()” which will print values of this array.
    Create class Main, which will create two instances of class MyInit and invoke method “printArray()”
        to print values of their arrays on console.

    Example of output:
        23,43,11,34,78,59,34,61,24,2
        5,48,50,3,1,4,67,62,78,98

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to create class with non-static initialization block;

 Execute following steps:
    Student should create a new blank Java Project in IDE.
    Student should create Java class and provide all necessary code in a class.

 Evaluation	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class MyInit {

    private int[] arr;                          // non-static field

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
