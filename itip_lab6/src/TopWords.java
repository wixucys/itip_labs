import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopWords {
    public static void main(String[] args) {
        String filePath = "D:/projects/itip_lab6/words.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Map<String, Integer> wordCounts = new HashMap<>();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+"); // Разбиваем строку на слова, игнорируем регистр
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCounts.entrySet());

            Collections.sort(wordList, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                    return b.getValue().compareTo(a.getValue());
                }
            });

            System.out.println("Топ-10 самых часто встречающихся слов: ");
            for (int i = 0; i < Math.min(10, wordList.size()); i++) {
                Map.Entry<String, Integer> entry = wordList.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}