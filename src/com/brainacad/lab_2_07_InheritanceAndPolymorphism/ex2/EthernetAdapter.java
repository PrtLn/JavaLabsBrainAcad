package com.brainacad.lab_2_07_InheritanceAndPolymorphism.ex2;

class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Anternet Adapter: manufacturer: = " + manufacturer +
                ", price = " + price +
                ", serialNumber = " + serialNumber +
                ", frequency speed = " + speed +
                ", mac = " + mac;
    }
}
