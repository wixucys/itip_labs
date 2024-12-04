
import java.util.regex.*;

public class CheckString {
    public static void main(String[] args) {
        String inputText = "Пример текста с буквами aB и cD, а также eF.";
        String outputText = highlightUppercase(inputText);
        System.out.println(outputText);
    }

    public static String highlightUppercase(String text) {
        String regex = "([a-z])([A-Z])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String highlightedText = matcher.replaceAll("!" + "$1$2" + "!");
        
        return highlightedText;
    }
}
