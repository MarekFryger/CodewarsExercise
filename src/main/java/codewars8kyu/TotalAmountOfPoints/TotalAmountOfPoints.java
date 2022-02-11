package codewars8kyu.TotalAmountOfPoints;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class TotalAmountOfPoints {
    public static int points(String[] games) {
        AtomicInteger points= new AtomicInteger();
        points.set(0);
        Arrays.stream(games).forEach(match->{
            if(Integer.parseInt(match.substring(0,1))>Integer.parseInt(match.substring(2))){
                points.set(points.get() + 3);
            }else if(Integer.parseInt(match.substring(0,1))==Integer.parseInt(match.substring(2))){
                points.set(points.get() + 1);
            }
        });
        return points.get();
    }
}
