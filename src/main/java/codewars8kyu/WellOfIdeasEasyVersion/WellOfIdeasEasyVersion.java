package codewars8kyu.WellOfIdeasEasyVersion;

import java.util.Arrays;

public class WellOfIdeasEasyVersion {
    public static String well(String[] x) {
        String well="Publish!";
        String fail="Fail!";
        String series="I smell a series!";
        long howManyIdeasAreGood= Arrays.stream(x).filter(idea -> idea.equals("good")).count();
        if(howManyIdeasAreGood==0){
            return fail;
        }else if ( howManyIdeasAreGood <=2){
            return well;
        }else {
            return series;
        }
    }
}
