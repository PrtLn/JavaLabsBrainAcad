package com.brainacad.lab_2_04_Static_Methods_and_Fields.lab_2_4_5;

/**
 * Created by L.Pikalova on 15.09.2016.
 * Lab Work 2-4-5
 Goal
    Getting a practical experience in
    	Using static field of class
 Task
    The value of π can be calculated with the series:
        π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
    Write a class MyCalc with public static method calcPi(int)
        that takes as parameter an integer n, and computes and
        returns the value of π approximated to the first n terms of the series.

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use static field
    Execute following steps:
        Student should create his or her own Java class and provide all necessary code in a method main()
    Ask student to execute the program

 Evaluation		the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
*/

public class MyCalc {

    // replace -1 return after check with exceptions later
    public static double calcPi(int n) {
        if (n < 0) {
            System.out.println("N should be positive number");
            return -1;
        }
        boolean add = true;
        double pi = 0;
        for (int i = 1; i <= n; i += 2) {
            if (add) {
                pi += 4.0D / i;
            } else {
                pi -= 4.0D / i;
            }
            add = !add;
        }
        return pi;
    }

    public static void main(String[] args) {
        //System.out.println(MyCalc.calcPi(10));
        System.out.println("Pi is " + MyCalc.calcPi(100000));
    }
}
