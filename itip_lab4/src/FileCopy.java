import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Использование: FileCopy <источник> <назначение>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile)); 
        BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}
