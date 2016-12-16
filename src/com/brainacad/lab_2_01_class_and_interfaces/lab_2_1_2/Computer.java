package com.brainacad.lab_2_01_Class_and_Interfaces.lab_2_1_2;

/**
 * Created by L.Pikalova on 14.09.2016.
 * Lab Work 2-1-2
 Goal
    Getting a practical experience in
    	Writing simple class with getters and setters(well encapsulated class).
 Task
    The fields if Computer class need to be encapsulated.
        Add to Computer class getters and setters methods.
        Use correct access modifiers.

 Preparation	No special preparation

 Execution\ methodology
    Remind that  student should apply his or her knowledge of:
    •	how to create class with methods;
    •	how to create well encapsulated class;
    Execute following steps:
    •	Student should create a new blank Java Project in IDE.
    •	Student should create his or her own Java class

 Evaluation		No special evaluation;
 Closure	Issues discussion, on demand
 Reporting	No special reporting
 */

public class Computer {

    // initialization of variables
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    // initialization instance Ex2Computer
    public Computer(String manufacturer, int serialNumber, float price) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    // getters and setters
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }
    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }
    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    // input point
    public static void main(String[] args) {

        // create tree instances of class with arguments (mahufacturer, serial number and price)
        Computer comp1 = new Computer("INTEL", 007, 1200.54f);
        Computer comp2 = new Computer("AMD64", 3, 2406f);
        Computer comp3 = new Computer("RASPBERRY PI", 500, 323.9f);

        // invoke get methods in in the created local variables for difrent models of computers
        String fabric1 = comp1.getManufacturer();
        int serial1 = comp1.getSerialNumber();

        String fabric2 = comp2.getManufacturer();
        int serial2 = comp2.getSerialNumber();

        String fabric3 = comp3.getManufacturer();
        int serial3 = comp3.getSerialNumber();

        float price1 = comp1.getPrice();
        float price2 = comp2.getPrice();
        float price3 = comp3.getPrice();

        // input characteristics of instances to console
        System.out.println("Model: "+ fabric1 + ", serial number: " + "00" + serial1 + ", price: " + price1);
        System.out.println("Model: "+ fabric2 + ", serial number: " + serial2 + ", price: " + price2);
        System.out.println("Model: "+ fabric3 + ", serial number: " + serial3 + ", price: " + price3);
    }
}


