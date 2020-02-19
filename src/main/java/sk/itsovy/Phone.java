package sk.itsovy;

public class Phone {

    private String name;
    private String brand;
    private double screenSize;
    private int ramSize;
    private String cpu;

    public Phone()
    {

    }

    public Phone(String name, String brand, double screenSize, int ramSize, String cpu) {
        this.name = name;
        this.brand = brand;
        this.screenSize = screenSize;
        this.ramSize = ramSize;
        this.cpu = cpu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}
