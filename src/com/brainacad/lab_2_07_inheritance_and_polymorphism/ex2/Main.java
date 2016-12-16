package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex2;

/**
 * Lab Work 2-7-2
 Goal
    Getting a practical experience in
    •	Overriding toString() method
 Task
    Override toString() method in each class
        In toString() method provide code which prints class name and fields values.
    Example:
        Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how override toString() method
    Execute following steps:
    •	override toString() method.

 Evaluation	•	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Device device = new Device("Intel", 555, "FX2Core");
        Monitor monitor = new Monitor("Dell", 260, "CCC4839fA", 1400, 1024);
        EthernetAdapter adapter = new EthernetAdapter("DigitalStar", 45, "333HGS", 990, "FF56");

        System.out.println(device);
        System.out.println(monitor);
        System.out.println(adapter);
    }
}
