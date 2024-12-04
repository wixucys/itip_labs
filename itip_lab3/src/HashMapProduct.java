import java.util.HashMap;

public class HashMapProduct {
    private HashMap<String, Product> inventory;

    public HashMapProduct() {
        inventory = new HashMap<>();
    }

    public void addProduct(String barcode, String name, int price, int quantity) {
        if (inventory.containsKey(barcode)) {
            inventory.get(barcode).quantity += quantity;
        } else {
            inventory.put(barcode, new Product(name, price, quantity));
        }
    }

    public Product findProduct(String barcode) {
        return inventory.getOrDefault(barcode, null);
    }

    public void removeProduct(String barcode) {
        inventory.remove(barcode);
    }

    public int getSize() {
        return inventory.size();
    }

    public void printInventory() {
        for (String barcode : inventory.keySet()) {
            Product product = inventory.get(barcode);
            System.out.println("Штрихкод: " + barcode + ", Название: " + product.name + ", Цена: " + product.price + ", Количество: " + product.quantity);
        }
    }
}
