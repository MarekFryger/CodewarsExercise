package codewars7kyu.HappyBirthday;

import java.util.Arrays;

public class HappyBirthday {
    public static int wrap(int height, int width, int length) {
        int[] dimensions = new int[]{height,length,width};
        Arrays.sort(dimensions);
        return 20+((4*dimensions[0])+(2*dimensions[1])+(2*dimensions[2]));
    }


}
