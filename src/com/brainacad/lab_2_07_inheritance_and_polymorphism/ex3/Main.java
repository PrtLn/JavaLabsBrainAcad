package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex3;

/**
 * Lab Work 2-7-3
 Goal
    Getting a practical experience in
    •	Overriding equals method.
 Task
    Override equals() method in each class

 Preparation	No special preparation
 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how override equals method
    Execute following steps:
    •	override equals method.

 Evaluation	•	no special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Device device1 = new Device("Intel", 800, "2coreFX");
        Device device2 = new Device("Mac", 1000, "iMac003");

        Monitor monitor1 = new Monitor("Dell", 366, "DD66M3a", 1400, 900);
        Monitor monitor2 = new Monitor("Dell", 366, "DD66M3a", 1900, 960);

        EthernetAdapter adapter1 = new EthernetAdapter("DigitalStar", 55, "S5580ss", 220, "Utel34");
        EthernetAdapter adapter2 = new EthernetAdapter("DigitalStar", 55, "S5580ss", 220, "Utel34");

        System.out.println("Equality of the devices: " + device1.equals(device2));
        System.out.println("Equality of the monitors: " + monitor1.equals(monitor2));
        System.out.println("Equality of the ethernet adapters: " + adapter1.equals(adapter2));
    }
}
