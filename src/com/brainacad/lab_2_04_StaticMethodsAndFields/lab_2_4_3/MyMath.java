package com.brainacad.lab_2_04_StaticMethodsAndFields.lab_2_4_3;

/**
 * Created by L.Pikalova on 15.09.2016.
 * Lab Work 2-4-3
 Goal
    Getting a practical experience in
    	Using of static methods of class and constant(static final field)
 Task
    Add to class MyMath final static field PI = 3.14 and
        static method areaOfCircle, which will take radius, use constant PI and calculate area.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    	how to use static methods
    	how to use constant
    Execute following steps:
    	Student should add new static method and constant

 Evaluation		the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class MyMath {

	public static int area;
	public static int r;

	public final static double PI = 3.14;


	public static double areaOfCircle(int r) {
		int area = (int) (2 * PI * r);
		return area;
	}

    public static void main(String[] args) {

		System.out.println(areaOfCircle(6));
    }
}
