import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAverage {

    private static double calculateAverage(int[] arr) {
        int sum = 0;

        for (int el : arr) {
            sum += el;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] arr = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                try {
                    arr[i] = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введен некорректный элемент массива. Пожалуйста, введите число.");

                    scanner.nextLine();
                    i--;
                }
            }

            try {
                double average = calculateAverage(arr);
                System.out.println("Среднее арифметическое: " + average);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ошибка: выход за границы массива.");
            }
        }
    }
}
