import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Warehouse {
    private static final int MAX_WEIGHT = 150;

    public static void main(String[] args) {
        List<Integer> items = List.of(50, 70, 30, 20, 40, 60, 90, 30, 20);

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        CompletableFuture<Void> task = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                processItems(items, executor);
            }
        });

        task.join();

        executor.shutdown();
    }

    private static void processItems(List<Integer> items, ThreadPoolExecutor executor) {
        List<Integer> currentLoad = new ArrayList<>();
        int currentWeight = 0;

        for (int item : items) {
            if (currentWeight + item <= MAX_WEIGHT) {
                currentLoad.add(item);
                currentWeight += item;
            } else {
                deliverLoadAsync(currentLoad, currentWeight, executor);
                currentLoad = new ArrayList<>();
                currentLoad.add(item);
                currentWeight = item;
            }
        }
        if (!currentLoad.isEmpty()) {
            deliverLoadAsync(currentLoad, currentWeight, executor);
        }
    }

    private static void deliverLoadAsync(List<Integer> load, int weight, ThreadPoolExecutor executor) {
        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                deliverLoad(load, weight);
            }
        }, executor);
    }

    private static void deliverLoad(List<Integer> load, int weight) {
        System.out.println("Грузчики несут товары: " + load + ", общий вес: " + weight + " кг.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Грузчики доставили товары: " + load);
    }
}
