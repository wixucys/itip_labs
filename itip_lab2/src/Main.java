package src;
import src.*;

public class Main {
    public static void main(String[] args) {
        Phone iphone = new Phone("phone", 70_000, 250.6, "iOS", 8);

        Watch galaxy = new Watch("watch", 20_000, 40.0, "blue", 7);

        Laptop acer = new Laptop("laptop", 95_000, 2500.0, 15.6, 11);

        iphone.aboutGadget();
        galaxy.aboutGadget();
        acer.aboutGadget();

        iphone.changeOs("android");
        galaxy.changeColor("pink");
        acer.changeOsVersion(8);

        System.out.println("После изменений: ");
        iphone.aboutGadget();
        galaxy.aboutGadget();
        acer.aboutGadget();

        System.out.println("Объектов создано: " + Gadgets.getObjectCount());
    }
}
