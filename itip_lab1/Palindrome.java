public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) { 
            String s = args[i];
            System.out.println(isPalindrome(s)); // является ли палиндромом
            }
    }

    public static String reverseString(String s) {
        char[] arr = s.toCharArray(); // переводим строку в массив, в котором хранятся символы
        String resultOfReverse = ""; // локальная переменная
        for(int i = arr.length - 1; i >= 0; i--) {
            resultOfReverse += arr[i]; // цикл перебирает элементы массива по индексам от последнего до нулевого, тем самым выдавая символы в обратном порядке и записывая их в пустую строку
        }
        return resultOfReverse; // возвращает строку, обратную первоначальной
    }

    public static boolean isPalindrome(String s) {
        String defaultString = s; // первоначальная строка
        String reverse = reverseString(s); // метод, применяемый к первоначальной строке
        return defaultString.equals(reverse);
    }
}
