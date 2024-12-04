package src;

class Watch extends Gadgets {

    private String color;
    private int sensors; // количество датчиков 

    public Watch() {
        this("Watch", 20_000, 40.6, "white", 5);
    }

    public Watch(String type, int price, double weight, String color, int sensors) {
        super(type, price, weight);
        this.color = color;
        this.sensors = sensors;
    }


    // переопределение
    @Override
    public void aboutGadget() {
        System.out.println("Это часы цвета " + color + ", количество датчиков: " + sensors);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }

    public int getSensors() {
        return sensors;
    }

    public void setSensors(int value) {
        this.sensors = value;
    }

    // перегрузка
    public void changeColor(String newColor) {
        this.color = newColor;
    }
}
