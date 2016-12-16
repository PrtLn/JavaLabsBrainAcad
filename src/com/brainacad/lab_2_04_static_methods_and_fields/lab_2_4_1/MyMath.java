package com.brainacad.lab_2_04_Static_Methods_and_Fields.lab_2_4_1;

/**
 * Created by L.Pikalova on 9/13/2016.
 * Lab Work 2-4-1
 Goal
    Getting a practical experience in
        Writing simple class with static methods.
 Task
    Create class MyMath with two static methods (findMin and findMax),
        which will take array of int values  as argument and
        return minimum element value (for findMin method) or
        maximum element value (for findMax method).

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to create class with static methods;
    Execute following steps:
        Student should create a new blank Java Project in IDE.
        Student should create his or her own Java class with static methods.

 Evaluation	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
*/

public class MyMath {

    public static int[] arr = {38, 385, 485, 1, 0, 288, 102, 3, 57};

    public static int min;
    public static int max;

    public static int findMin(int[] arr) {
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
    }
}


