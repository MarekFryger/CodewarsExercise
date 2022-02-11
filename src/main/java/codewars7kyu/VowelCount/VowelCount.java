package codewars7kyu.VowelCount;

public class VowelCount {
    public static int getCount(String str) {

        int vowelsCount = 0;
        char[] toCharArray = str.toCharArray();
        for(char c:toCharArray){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
