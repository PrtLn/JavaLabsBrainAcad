package com.brainacad.lab_2_03_Constructors.lab_2_3_4;

/**
 * Created by L.Pikalova on 9/18/2016.
 * Lab Work 2-3-4
 Goal
    Getting a practical experience in
        Design constructors that provide better user interface
        and at the same time assure the integrity of the data
        that the instances of the class represent

 Task
    Change code in two overloaded constructors to invoke first constructor using “this” keyword.

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use overloaded constructors
        how to use “this” keyword to invoke constructor
    Execute following steps:
        Student should change code in MyWindow(width, height)
            and MyWindow(width, height, numberOfGlass) constructors
    Ask student to execute the program

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class MyWindow {

    private static double width;
    private static double height;
    private static int numberOfGlass;

    public MyWindow(double width, double height) {
        //super();
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width, height);
        this.numberOfGlass = numberOfGlass;
    }

    @Override
    public String toString() {
        return "width: " + width +
                " meter, hight: " + height +
                " meter, number of glass: " + numberOfGlass;
    }

    public static void main(String[] args) {

        MyWindow window1 = new MyWindow(2.00, 3.00);
        MyWindow window2 = new MyWindow(4.00, 5.00, 3);

        System.out.println("Window 1 have " + window1);
        //System.out.println("Window 2 have " + window2);
    }
}
