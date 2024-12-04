package src;

class Phone extends Gadgets {
    
    private String os;
    private int ram;

    public Phone() {
        this("phone", 40_000, 120.5, "iOS", 8);
    }

    public Phone(String type, int price, double weight, String os, int ram) {
        super(type, price, weight);
        this.os = os;
        this.ram = ram;
    }


    // переопределение
    @Override
    public void aboutGadget() {
        System.out.println("Это смартфон с опертивной памятью " + ram + "ГБ и операционной системой " + os);
    }


    public String getOs() {
        return os;
    }

    public void setOs(String value) {
        this.os = value;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int value) {
        this.ram = value;
    }

    // перегрузка
    public void changeOs(String newOs) {
        this.os = newOs;
    }
}
