package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex5;

/**
 * Lab Work 2-7-5
 Goal
    Getting a practical experience in
    •	Using inheritance
 Task
    Create program (class Main).
    The program must demonstrate the creation of an arrays of different types devices,
        setup and output characteristics of each device

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how to use inheritance
    Execute following steps:
    •	Student should create his or her own Java class and provide all necessary code in a method main()

 Evaluation	•	the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Main {
    public static void main(String[] args) {

        Device[] arrayDevices = new Device[3];
        Monitor[] arrayMonitors = new Monitor[3];
        EthernetAdapter[] arrayAdapters = new EthernetAdapter[3];

        for (int i = 0; i < arrayDevices.length; i++) {
            arrayDevices[0] = new Device("Intel", 555, "FD456a");
            arrayDevices[1] = new Device("AMD", 400, "4Xturbo");
            arrayDevices[2] = new Device("Macintosh", 900, "III6");
            System.out.println("Computer " + arrayDevices[i]);
        }
        System.out.print('\n');

        for (int i = 0; i < arrayMonitors.length; i++) {
            arrayMonitors[0] = new Monitor("Dell", 200, "456NF", 1024, 900);
            arrayMonitors[1] = new Monitor("NEC", 300, "LCD567", 1800, 960);
            arrayMonitors[2] = new Monitor("Samsung", 250, "TFT34", 1400, 900);
            System.out.println("Monitor " + arrayMonitors[i]);
        }
        System.out.print('\n');

        for (int i = 0; i < arrayAdapters.length; i++) {
            arrayAdapters[0] = new EthernetAdapter("FastStart", 45, "Utel5F", 999, "00:05:00:a1:2b:aa");
            arrayAdapters[1] = new EthernetAdapter("DigitSpark", 33, "AF454", 900, "00:f4:00:a1:c6:cc");
            arrayAdapters[2] = new EthernetAdapter("Shining", 45, "Utel5F", 999, "01:46:00:ca:46:ff");
            System.out.println("Internet Adapter " + arrayAdapters[i]);
        }
    }
}
