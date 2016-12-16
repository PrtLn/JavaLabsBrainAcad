package com.brainacad.lab_2_04_Static_Methods_and_Fields.lab_2_4_7;

/*
Lab Work 2-4-7
Goal
    Getting a practical experience in
        Using static field of class
Task
    Write a program that computes the distance an object will fall in Earth's gravity.
    Create a new class called GravityCalculator with method calcDist(double t) that takes double  t,
        and returns the the position of an object after falling for t seconds
        outputting the position in meters).

    The formula in Math notation is:
        x(t) = 0.5 × at 2 + vit + xi
    Where:
        a - Acceleration (m/s 2 ) = -9.81
        t - Time (s) (for example t = 10)
        vi Initial velocity (m/s) = 0
        xi Initial position = 0

    Declare Acceleration value field as a constant;

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

public class GravityCalculator {

    public static double calcDist(double t){

        final double acceleration = -9.81;
        double initialVelocity = 0;
        double initialPosition = 0;

        return  0.5 * acceleration * t * t + initialVelocity * t + initialPosition;
    }

    public static void main(String[] args) {

        System.out.println(GravityCalculator.calcDist(10));
    }
}
