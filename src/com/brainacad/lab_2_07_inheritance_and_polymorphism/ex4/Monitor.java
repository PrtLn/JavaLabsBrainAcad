package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex4;

class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor: manufacturer: = " + manufacturer +
                ", price = " + price +
                ", serialNumber = " + serialNumber +
                ", resolution by X = " + resolutionX +
                ", resolution by Y = " + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!super.equals(o)) return false;

        Monitor monitor = (Monitor) o;

        if (getResolutionX() != monitor.getResolutionX()) return false;
        return getResolutionY() == monitor.getResolutionY();
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        int result = getResolutionX();
        result = 31 * result + getResolutionY();
        return result;
    }
}
