package codewars7kyu.LookingForABenefactor;

import java.util.Arrays;

public class LookingForABenefactor {
    public static long newAvg(double[] arr, int navg) {
        double sum = Arrays.stream(arr).sum();
        double average = sum/ arr.length;
        int i=0;
        if(average>=navg){
            throw new IllegalArgumentException();
        }else if(sum==0){
            return (long) navg;
        } else {
            for (i=0;average<navg;i++){
                average=(sum+i)/ (arr.length+1);
            }
            return i-1;
        }
    }
}
