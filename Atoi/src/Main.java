import java.math.BigInteger;

public class Main {

    public int myAtoi(String str) {
        str = str.trim();
        str = str.replaceAll("([\\sA-za-z]\\w*)?", "");
        long l = 0;
        if (str.isEmpty()) {
            return 0;
        }
        int length = 0;
        try {
            length = str.length();
            l = Long.parseLong(str);
            if (l > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (l < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            if (length > 10) {
                return str.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            return 0;
        }
        return (int) l;
    }

    public static void main(String[] args) {
        Main main = new Main();
        String atr = "+9223372036854775809";
        main.myAtoi(atr);

    }
}
