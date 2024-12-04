public class Main {
    public static void main(String[] args) {
        
        HashTable<String, Integer> hashTable = new HashTable<>(24);
        hashTable.put("pear", 5);
        hashTable.put("banana", 4);
        hashTable.put("plum", 3);
        // hashTable.put("apple", 3);

        System.out.println(hashTable.get("plum"));

        hashTable.remove("pear");

        System.out.println("Размер таблицы: " + hashTable.size());

        System.out.println("Таблица пустая? " + hashTable.isEmpty());

        System.out.println("\n////////////////////////////////////////////////////////////////////\n");


        HashMapProduct inventory = new HashMapProduct();

        inventory.addProduct("1234567890", "Молоко", 80, 10);
        inventory.addProduct("9876543210", "Хлеб", 60, 5);
        inventory.addProduct("1234567890", "Молоко", 80, 5);
        inventory.addProduct("1212121212", "Шоколад", 110, 7);
        System.out.println("Инвентарь:");
        inventory.printInventory();

        Product milk = inventory.findProduct("1234567890");
        if (milk != null) {
            System.out.println("Молоко найдено: " + milk.quantity + " шт.");
        } else {
            System.out.println("Молоко не найдено.");
        }

        inventory.removeProduct("9876543210");

        System.out.println("\nИнвентарь после удаления хлеба:");
        inventory.printInventory();

        System.out.println("\nРазмер инвентаря: " + inventory.getSize());
    }
}
