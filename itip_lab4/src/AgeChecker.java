import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите возраст: ");
            int age = scanner.nextInt();

            try {
                checkAge(age);
                System.out.println("Возраст допустим.");
            } catch (CustomAgeException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static void checkAge(int age) throws CustomAgeException {
        if (age < 0 || age > 120) {
            throw new CustomAgeException("Недопустимый возраст. Возраст должен быть в диапазоне от 0 до 120.");
        }
    }
}
