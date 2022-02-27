package codewars5kyu.Scramblies;

import java.util.Locale;

public class Scrambles {
    public static boolean scramble(String str1, String str2) {
        boolean result = false;
        char[] chars2 = str2.toLowerCase(Locale.ROOT).toCharArray();
        for (char c : chars2) {
            if (str1.contains(Character.toString(c))) {
                result = true;
                str1 = str1.replaceFirst(Character.toString(c), "");
            } else {
                return false;
            }
        }
        return result;
    }
}
