
import java.util.regex.*;

public class CheckIP {
    public static void main(String[] args) {
        String ip1 = "192.168.1.1";
        String ip2 = "21213141";

        try {
            checkIP(ip2);
            System.out.println("IP-адрес корректный!");
        } catch (CustomIPException e) {
            System.out.println(e);
        }
    }

    public static void checkIP(String ipAddress) throws CustomIPException {
        String patternString = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(ipAddress);

        if (!matcher.matches()) {
            throw new CustomIPException("Недопустимый IP-адрес.");
        }
    }
}
