import java.util.HashMap;
import java.util.Map;

public class HashMapInv {
    private Map<String, Integer> sales;

    public HashMapInv() {
        sales = new HashMap<>();
    }

    public void addSale(String item) {
        sales.put(item, sales.getOrDefault(item, 0) + 1);
    }

    public void printSalesList() {
        System.out.println("Список проданных товаров: ");
        if (sales.isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        for (String item : sales.keySet()) {
            System.out.println(item + ": " + sales.get(item) + " шт.");
        }
    }

    public int getTotalSalesAmount() {
        int total = 0;
        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }

    public String getMostPopularItem() {
        if (sales.isEmpty()) {
            return "Список продаж пуст.";
        }
    
        String mostPopularItem = null;
        int maxCount = -1;

        for (Map.Entry<String, Integer> entry : sales.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopularItem = entry.getKey();
            }
        }
    
        return mostPopularItem;
    }


    public static void main(String[] args) {
        HashMapInv tracker = new HashMapInv();
        tracker.addSale("Яблоки");
        tracker.addSale("Бананы");
        tracker.addSale("Яблоки");
        tracker.addSale("Апельсины");
        tracker.addSale("Яблоки");
        tracker.addSale("Бананы");

        tracker.printSalesList();
        System.out.println("Общая сумма продаж: " + tracker.getTotalSalesAmount() + " шт.");
        System.out.println("Самый популярный товар: " + tracker.getMostPopularItem());
    }
}
