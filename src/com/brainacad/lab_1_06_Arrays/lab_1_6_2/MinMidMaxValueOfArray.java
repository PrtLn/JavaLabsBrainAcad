package com.brainacad.lab_1_06_Arrays.lab_1_6_2;

import java.util.Arrays;

/**
 * Created by L.Pikalova on 08.09.2016.
 * Lab Work 1-6-2
 Goal:
    Getting a practical experience in
        Writing simple console application, using array and enhanced loop for typical operations on arrays (search).
 Task:
    There are statistics for the year by months as an array:

        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };

    Write code which calculates the maximum value from the array, the minimum value, the average and the median.

 Preparation	No special preparation

 Execution\ methodology:
    Remind that  student should apply his or her knowledge of:
        how to use arrays
        how to use loops for search;
    Execute following steps:
        Student should create a new blank Java Project in IDE.
        Student should create his or her own Java class and provide all necessary code in a method main()
        Student should use enhanced loop.
    Ask student to execute the program

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class MinMidMaxValueOfArray {
    public static void main(String[] args) {

        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};

        // initial arrays
        System.out.println(Arrays.toString(m));

        // sort arrays
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));

        /*
        // minimum, median and maximum value without loop
        int min = m[0];
        System.out.println("Minimum value: " + min);

        int max = m[m.length-1];
        System.out.println("Maximum value: " + max);

        int mid = m[(m.length - 1) / 2];
        System.out.println("Median value: " + mid);
        */
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //int med = 0;

        // choose minimum, median and maximum value whit loop
        for (int item : m) {
            if (item < min) min = item;
            if (item > max) max = item;
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Median value: " + max / 2);
        System.out.println("Maximum value: " + max);
    }
}
