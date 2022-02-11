package codewars8kyu.CountOfPositivesSumOfNegatives;

import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) {
            return new int[]{};
        } else {
            int positive = (int) Arrays.stream(input).filter(number -> number > 0).count();
            int negative = Arrays.stream(input).filter(number -> number < 0).sum();
            return new int[]{positive, negative};
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(null)));
    }
}
