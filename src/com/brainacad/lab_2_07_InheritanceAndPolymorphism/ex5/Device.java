package com.brainacad.lab_2_07_InheritanceAndPolymorphism.ex5;

public class Device {

    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public Device() {
    }

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

    @Override
    public String toString() {
        return "manufacturer: = " + manufacturer +
                ", price = " + price +
                ", serialNumber = " + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Float.compare(device.getPrice(), getPrice()) != 0) return false;
        if (getManufacturer() != null ? !getManufacturer().equals(device.getManufacturer()) : device.getManufacturer() != null)
            return false;
        return getSerialNumber() != null ? getSerialNumber().equals(device.getSerialNumber()) : device.getSerialNumber() == null;
    }

    @Override
    public int hashCode() {
        int result = getManufacturer() != null ? getManufacturer().hashCode() : 0;
        result = 31 * result + (getPrice() != +0.0f ? Float.floatToIntBits(getPrice()) : 0);
        result = 31 * result + (getSerialNumber() != null ? getSerialNumber().hashCode() : 0);
        return result;
    }
}

