package com.brainacad.lab_2_07_Inheritance_and_Polymorphism.ex5;

class EthernetAdapter extends Device {

    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public EthernetAdapter() {
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

    @Override
    public String toString() {
        return "manufacturer: = " + manufacturer +
                ", price = " + price +
                ", serialNumber = " + serialNumber +
                ", frequency speed = " + speed +
                ", mac = " + mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        if (!super.equals(o)) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (getSpeed() != that.getSpeed()) return false;
        return getMac() != null ? getMac().equals(that.getMac()) : that.getMac() == null;
    }

    @Override
    public int hashCode() {
        int result = getSpeed();
        result = 31 * result + getMac().hashCode();
        return result;
    }
}
