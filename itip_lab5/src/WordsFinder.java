
import java.util.regex.*;

public class WordsFinder {
    public static void main(String[] args) {
        String text = "Hello, bird, bear, beew, wolf, catwe.";
        char inputChar = 'w';
        
        String regex = "\\b\\w*" + inputChar + "\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
