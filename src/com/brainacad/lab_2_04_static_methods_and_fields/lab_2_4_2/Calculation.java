package com.brainacad.lab_2_04_Static_Methods_and_Fields.lab_2_4_2;

import static com.brainacad.lab_2_04_Static_Methods_and_Fields.lab_2_4_1.MyMath.findMax;
import static com.brainacad.lab_2_04_Static_Methods_and_Fields.lab_2_4_1.MyMath.findMin;

/**
 * Created by L.Pikalova on 14.09.2016.
 * Lab Work 2-4-2
 Goal
    Getting a practical experience in
    	Using of static methods of class
 Task
    Create class Calculation, which will create two arrays of integers and use findMin and findMax static methods of MyMath class.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    	how to use static methods
 	Execute following steps:
 		Student should create his or her own Java class and provide all necessary code in a method main()

 Evaluation		the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Calculation {

	public static int[] arr1 = {45,993,67,8,59,30,777,2};
	public static int[] arr2 = {23,456,4,339,60,21};

	public static void main(String[] args) {
		System.out.println(findMin(arr1));
		System.out.println(findMax(arr1));

		System.out.println();

		System.out.println(findMin(arr2));
		System.out.println(findMax(arr2));
	}
}


