
import java.util.regex.*;

public class NumberFinder {

    public static void main(String[] args) {
        String text1 = "Этот текст содержит числа: 123, 45.6, 789, 1.0, .5, и еще 10.";
        String text2 = "Этот текст не содержит числа.";

        try {
            Pattern pattern = Pattern.compile("\\d*\\.?\\d+");
            Matcher matcher = pattern.matcher(text1);

            boolean foundNumbers = false; // Флаг для отслеживания наличия чисел
      
            System.out.println("Найденные числа:");
            while (matcher.find()) {
                System.out.println(matcher.group());
                foundNumbers = true; // Устанавливаем флаг, если нашли число
            }

            if (!foundNumbers) {
                System.out.println("Этот текст не содержит чисел");
            }

        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
