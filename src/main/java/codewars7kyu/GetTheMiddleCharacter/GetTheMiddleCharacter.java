package codewars7kyu.GetTheMiddleCharacter;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        int middle = word.length() / 2;
        char[] charArray = word.toCharArray();
        if (charArray.length % 2 != 0) {
            return Character.toString(charArray[middle]);
        } else {
            return Character.toString(charArray[middle - 1]) + Character.toString(charArray[middle]);
        }
    }
}
