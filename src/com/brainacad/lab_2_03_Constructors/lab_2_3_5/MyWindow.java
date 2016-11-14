package com.brainacad.lab_2_03_Constructors.lab_2_3_5;

/**
 * Created by L.Pikalova on 9/18/2016.
 * Lab Work 2-3-5
 Goal
    Getting a practical experience in
        Design constructors that provide better user interface and at the same time assure
           the integrity of the data that the instances of the class represent
 Task
    Add method “printFields” to  MyWindow class.
        In printFields method write code that print all fields values to console.
    Create array of MyWindow’s and fill it by creating MyWindow’s objects using different constructors.
    Call method “printFields” on each array element.

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how to use overloaded constructors
    Execute following steps:
        Student should create method printFields and provide all necessary code
        Student should create array of MyWindow
        Student should use overloaded constructors to creating MyWindow instances
        Student should use array of MyWindow objects
    Ask student to execute the program

 Evaluation	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow() {
    }

    public void printFields() {
        System.out.println("Window have " + this);
    }

    @Override
    public String toString() {
        return "width: " + width +
                " meter, hight: " + height +
                " meter, number of glass: " + numberOfGlass;
    }

    public static void main(String[] args) {

        MyWindow window1 = new MyWindow();
        MyWindow window2 = new MyWindow(1.00, 2.00);
        MyWindow window3 = new MyWindow(3.00, 4.00, 2);

        MyWindow[] fields = new MyWindow[]{window1, window2, window3};

        for (MyWindow window : fields) {
            window.printFields();
        }
    }
}
