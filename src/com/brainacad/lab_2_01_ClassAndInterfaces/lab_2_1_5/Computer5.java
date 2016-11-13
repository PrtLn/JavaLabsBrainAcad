package com.brainacad.lab_2_01_ClassAndInterfaces.lab_2_1_5;

import java.util.Arrays;

/**
 * Created by L.Pikalova on 14.09.2016.
 * Lab Work 2-1-5

 Goal
    Getting a practical experience in
    •	Writing simple console application, using methods of class.
 Task
    Add to class Computer method void view (){} that prints all fields of object in line.
    Print all info (fields) of all objects in console.

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how to create and use methods
    •	how to use enhanced loop
    Execute following steps:
    •	Student should create a new blank Java Project in IDE.
    •	Student should create his or her own Java class and provide all necessary code in a method main()
    •	Student should use enhanced loop.
    Ask student to execute the program

 Evaluation		the program must work correctly;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Computer5 {
    // fields
    private String manufacturerComp5;
    private int serialNumberComp5;
    private float priceComp5;
    private int quantityCPUComp5;
    private int frequencyCPUComp5;

    public static void main(String[] args) {

        // create Computer instance with assigning arguments
        Computer5 compEx5 = new Computer5();

        // assigning values to object with setters
        compEx5.setManufacturerEx5("AMD");
        compEx5.setSerialNumberEx5(64);
        compEx5.setPriceEx5(2000f);
        compEx5.setQuantityCPUEx5(2400);
        compEx5.setFrequencyCPUEx5(64);

        //invoke method view()
        compEx5.view();

        //int item = 0;
        // создание массива computers с 5 элементами
        Computer5[] computers =  {new Computer5()};
        int i = 0;
        for (Computer5 item : computers) {
            Computer5 computer = new Computer5();
            item = computer;
            System.out.println(i);
            System.out.println(item);
            // привести массив toString()
            System.out.println(Arrays.toString(computers));
        }
    }

    @Override
    public String toString() {
        return "Computer {" +
                "manufacturer = '" + manufacturerComp5 + '\'' +
                ", serial number = " + serialNumberComp5 +
                ", price = " + priceComp5 +
                ", quantity CPU = " + quantityCPUComp5 +
                ", frequency CPU = " + frequencyCPUComp5 +
                '}';
    }

    // create method veiw(), which display charachteristics of Computer object
    public void view() {
        System.out.println("Manufacturer: " + this.getManufacturerEx5());
        System.out.println("SerialNumber: " + this.getSerialNumberEx5());
        System.out.println("Price: " + this.getPriceEx5());
        System.out.println("Quantity CPU: " + this.getQuantityCPUEx5());
        System.out.println("Frequency CPU: " + this.getFrequencyCPUEx5());
    }

    // print characteristics of Computer object with array

    // getters and setters
    public String getManufacturerEx5() {
        return manufacturerComp5;
    }
    public void setManufacturerEx5(String manufacturerEx5) {
        this.manufacturerComp5 = manufacturerEx5;
    }

    public int getSerialNumberEx5() {
        return serialNumberComp5;
    }
    public void setSerialNumberEx5(int serialNumberEx5) {
        this.serialNumberComp5 = serialNumberEx5;
    }

    public float getPriceEx5() {
        return priceComp5;
    }
    public void setPriceEx5(float priceEx5) {
        this.priceComp5 = priceEx5;
    }

    public int getQuantityCPUEx5() {
        return quantityCPUComp5;
    }
    public void setQuantityCPUEx5(int quantityCPUEx5) {
        this.quantityCPUComp5 = quantityCPUEx5;
    }

    public int getFrequencyCPUEx5() {
        return frequencyCPUComp5;
    }
    public void setFrequencyCPUEx5(int frequencyCPUEx5) {
        this.frequencyCPUComp5 = frequencyCPUEx5;
    }
}


