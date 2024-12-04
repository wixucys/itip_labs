
import java.util.regex.*;

public class CheckPass {
    
    public static void main(String[] args) {
        String password1 = "abc";
        String password2 = "Abcdefgh12";

        try {
            checkPass(password1);
            System.out.println("Пароль корректный!");
        } catch (CustomPassException e) {
            System.out.println(e);
        }
    }

    public static void checkPass(String password) throws CustomPassException {
        String patternString = "^(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,16}$";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(password);

        if(!matcher.matches()) {
            throw new CustomPassException("Недопустимый пароль.");
        }
    }
}
