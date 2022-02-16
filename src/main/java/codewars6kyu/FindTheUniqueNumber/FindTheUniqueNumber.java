package codewars6kyu.FindTheUniqueNumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheUniqueNumber {
    public static double findUniq(double[] arr) {
        Set<Double> aleDoubles = new HashSet<>();
        Map<Double, Double> howMany = new HashMap<>();
        Double result = 0D;
        for (double i : arr) {
            aleDoubles.add(i);
        }
        for (double i : aleDoubles) {
            howMany.put(i, 0D);
        }
        for (double i : arr) {
            if (howMany.containsKey(i)) {
                double temp = howMany.get(i)+1;
                howMany.put(i, temp);
            }
        }
        for (Map.Entry<Double,Double> entry: howMany.entrySet()) {
           if(entry.getValue()==1){
              result=entry.getKey();
           }
        }
        return result;
    }
}
