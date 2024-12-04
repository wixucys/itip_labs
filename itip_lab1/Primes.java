public class Primes {

    public static void main(String[] args) {
        for (int a = 2; a <= 100; a++) {
            if (isPrime(a)) {
                System.out.println(a);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

