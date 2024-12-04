public class Test {
    public static boolean isStrangePair(String s1, STring s2) {
        return(s1.charAt(0) == s2.charAt(s2.length()-1) && s1.charAt(s1.length()-1) == s2.charAt(0));
    }

    public static boolean successShot(int x, int y, int r, int m, int n) {
        int dist1 = m - x;
        int dist2 = n - y;

        double z = Math.sqrt(dist1*dist1 + dist2*dist2);

        if (z > r) return false;
        else return true;
    }

    public static boolean parityAnalys(int num) {
        int sum = 0;
        int n = num;

        while(n != 0) {
            sum = sum + n%10;
            n = n/10;
        }

        return(num%2 == sum%2);
    }

    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Tie";
        } else if (p1.equals("rock")) {
            if(p2.equals("paper")) {
                return "p2 w";
            } else {
                return "p1 w";
            }
        } else if (p1.equals("paper")) {
            if(p2.equals("rock")) {
                return "p1 w";
            } else {
                return "p2 w";
            }
        } else {
            if(p2.equals("rock")) {
                return "p2 w";
            } else {
                return "p1 w";
            }
        }
    }

    public static int bugger(int num) {
        int count = 0;

        if (num < 10) {
            return 0;
        }

        while (num >= 10) {
            num = mul(num);
            count++;
        }

        return count;
    }

    private static int mul(int num) {
        int m = 1;

        while(num != 0){
            m = m*(num%10);
            num = num/10;
        }

        return m;
    }
}
