package src;

public abstract class Gadgets {

    private String type; // тип гаджета
    private int price; // цена гаджета
    private double weight; // вес гаджета

    private static int objectCount = 0; // счетчик объектов

    public abstract void aboutGadget(); // для переопределения

    public void information() {
        System.out.println("Товар типа " + type + ", цена товара: " + price + ", вес товара: " + weight);
    }


    public Gadgets() {
        this("none", 0, 0.0);
    }

    public Gadgets(String type, int price, double weight) {
        this.type = type;
        this.price = price;
        this.weight = weight;

        objectCount++;
    }


    // геттеры

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    // сеттеры

    public void setType(String value) {
        this.type = value;
    }

    public void setPrice(int value) {
        this.price = value;
    }

    public void setWeight(double value) {
        this.weight = value;
    }


    public static int getObjectCount() {
        return objectCount;
    }
}