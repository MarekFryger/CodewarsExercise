package codewars6kyu.Binaries;

public class Binaries {
    public static String code(String string) {
        String result = "";
        char[] chars = string.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            int integer = Integer.parseInt(String.valueOf(chars[j]));
            String integerBinary = Integer.toBinaryString(integer);
            for (int i = 0; i < integerBinary.length() - 1; i++) {
                result = result + "0";
            }
            result = result + "1";
            result = result + integerBinary;
        }
        return result;
    }

    public static String decode(String str) {
        String[] code = new String[]{"10", "11", "0110", "0111", "001100", "001101", "001110", "001111", "00011000", "00011001"};
        char[] chars = str.toCharArray();
        String temp = "";
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            temp = temp + chars[i];
            for (int j = 0; j < code.length; j++) {
                if (code[j].equals(temp)) {
                    result = result + j;
                    temp = "";
                }
            }
        }
        return result;
    }
}
