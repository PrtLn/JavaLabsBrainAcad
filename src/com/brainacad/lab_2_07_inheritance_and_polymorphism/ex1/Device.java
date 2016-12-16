package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex1;

public class Device {
    // fields of superclass (protected)
    protected String manufacturer;
    protected float price;
    protected String serialNumber;
    // constructor Device which sets values for arguments
    public Device() {
        this.setPrice(1234);
        this.setManufacturer("ADM");
        this.setSerialNumber("64");
    }
    // constructor for Device which invokes values
    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }
    // getters and setters for fields
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}






