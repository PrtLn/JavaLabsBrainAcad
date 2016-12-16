package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex4;

/*
 * Created by L.Pikalova on 20.09.2016.
Goal
    Getting a practical experience in
        Overriding hashCode method
Task
    Override hashCode method in each class

Preparation  No special preparation
Execution\ methodology
    Remind that  student should apply his or her knowledge of:
        how override hashCode method

Execute following steps:
    Override hashCode method.

Evaluation  No special evaluation
Closure  Issues discussion, on demand
Reporting  No special reporting
*/

public class Main {
    public static void main(String[] args) {

        Device device1 = new Device("Intel", 800, "2coreFX");
        Device device2 = new Device("Mac", 1000, "iMac003");

        Monitor monitor1 = new Monitor("Dell", 366, "DD66M3a", 1400, 900);
        Monitor monitor2 = new Monitor("Dell", 366, "DD66M3a", 1900, 960);

        EthernetAdapter adapter1 = new EthernetAdapter("DigitalStar", 55, "S5580ss", 220, "Utel34");
        EthernetAdapter adapter2 = new EthernetAdapter("DigitalStar", 55, "S5580ss", 220, "Utel34");


        System.out.println("hash code of device 1: " + device1.hashCode());
        System.out.println("hash code of device 2: " + device2.hashCode() + '\n');

        System.out.println("hash code of monitor 1: " + monitor1.hashCode());
        System.out.println("hash code of monitor 2: " + monitor2.hashCode() + '\n');

        System.out.println("hash code of ethernet adapter 1: " + adapter1.hashCode());
        System.out.println("hash code of ethernet adapter 2: " + adapter2.hashCode());
    }
}
