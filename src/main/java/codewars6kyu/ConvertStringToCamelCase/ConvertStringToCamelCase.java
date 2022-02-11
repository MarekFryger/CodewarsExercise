package codewars6kyu.ConvertStringToCamelCase;

public class ConvertStringToCamelCase {
   public static String toCamelCase(String s) {
        String[] newTabString = s.split("_|-");
        String newString = "";
        for (int i = 0; i < newTabString.length; i++) {
            if (i == 0) {
                newString = newString.concat(newTabString[i]);
            } else {
                char[] temp = newTabString[i].toCharArray();
                String tempString = String.valueOf(temp[0]);
                tempString = tempString.toUpperCase();
                temp[0] = tempString.charAt(0);
                newTabString[i] = new String(temp);
                newString = newString.concat(newTabString[i]);
            }
        }
        return newString;
    }
}

