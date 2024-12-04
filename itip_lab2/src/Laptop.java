package src;

class Laptop extends Gadgets {

    private double diagonal;
    private int osVersion; // версия операционной системы

    public Laptop() {
        this("Laptop", 80_000, 2300.5, 15.6, 10);
    }

    public Laptop(String type, int price, double weight, double diagonal, int osVersion) {
        super(type, price, weight);
        this.diagonal = diagonal;
        this.osVersion = osVersion;
    }


    // переопределение
    @Override
    public void aboutGadget() {
        System.out.println("Это ноутбук с диагональю " + diagonal + ", версия операционной системы: " + osVersion);
    }


    public double getDiag() {
        return diagonal;
    }

    public void setDiag(double value) {
        this.diagonal = value;
    }

    public int getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(int value) {
        this.osVersion = value;
    }

    // перегрузка
    public void changeOsVersion(int newVersion) {
        this.osVersion = newVersion;
    }
}
