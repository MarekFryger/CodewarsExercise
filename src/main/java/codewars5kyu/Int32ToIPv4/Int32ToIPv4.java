package codewars5kyu.Int32ToIPv4;

public class Int32ToIPv4 {
    public static String longToIP(long ip) {
        int a = 0, b = 0, c = 0, d = 0;
        String binary = Long.toBinaryString(ip);
        int length = binary.length();
        try {
            if (length >= 25) {
                a = Integer.parseInt(binary.substring(0, binary.length() - 24), 2);
                b = Integer.parseInt(binary.substring(binary.length() - 24, binary.length() - 16), 2);
                c = Integer.parseInt(binary.substring(binary.length() - 16, binary.length() - 8), 2);
                d = Integer.parseInt(binary.substring(binary.length() - 8, binary.length()), 2);
            } else if (length < 25 && length >= 17) {
                b = Integer.parseInt(binary.substring(0, binary.length() - 16), 2);
                c = Integer.parseInt(binary.substring(binary.length() - 16, binary.length() - 8), 2);
                d = Integer.parseInt(binary.substring(binary.length() - 8, binary.length()), 2);
            } else if (length < 17 && length >= 9) {
                c = Integer.parseInt(binary.substring(0, binary.length() - 8), 2);
                d = Integer.parseInt(binary.substring(binary.length() - 8, binary.length()), 2);
            } else if (length < 9) {
                d = Integer.parseInt(binary, 2);
            }
        } catch (Exception e) {
        }

        return a + "." + b + "." + c + "." + d;
    }
}
