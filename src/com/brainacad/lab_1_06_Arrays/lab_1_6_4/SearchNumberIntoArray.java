package com.brainacad.lab_1_06_Arrays.lab_1_6_4;

import java.util.Arrays;

/**
 * Created by L.Pikalova on 08.09.2016.
 * Lab Work 1-6-4
 Goal:
    Getting a practical experience in
        Writing simple console application, using class Arrays.
 Task
    Write a program, which uses a binary search in a sorted array of integer numbers to find a certain element.

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use methods of Arrays class
        how to use loops
    Execute following steps:
        Student should create a new blank Java Project in IDE.
        Student should create his or her own Java class and provide all necessary code in a method main()
        Student should use binary search and sort methods.
    Ask student to execute the program

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class SearchNumberIntoArray {
    public static void main(String[] args) {

        int arrs[] = {38, 55, 2, 90, 3, 6, 45, 99, 17};
        System.out.println("initial: " + Arrays.toString(arrs) + '\n');

        Arrays.sort(arrs);
        System.out.println("sorted: " + Arrays.toString(arrs) + '\n');

        int searchVal1 = 55;
        int searchVal2 = 2;
        int searchVal3 = 3;
        int searchVal4 = 41; // Если числа нет в массиве выдает значение с минусом (wtf)

        int binary1 = Arrays.binarySearch(arrs, searchVal1);
        int binary2 = Arrays.binarySearch(arrs, searchVal2);
        int binary3 = Arrays.binarySearch(arrs, searchVal3);
        int binarY4 = Arrays.binarySearch(arrs, searchVal4);

        System.out.println("Index of   55 is  " + binary1);
        System.out.println("Index of  2 is  " + binary2);
        System.out.println("Index of   3 is  " + binary3);
        System.out.println("Index of 41 is  " + binarY4);
    }
}