package codewars7kyu.LookingForABenefactor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LookingForABenefactorTest {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests newAvg");
        double[] a = new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0};
        testing(LookingForABenefactor.newAvg(a, 90), 628);
        a = new double[]{14, 30, 5, 7, 9, 11, 15};
        testing(LookingForABenefactor.newAvg(a, 92), 645);
    }

    @Test
    public void testIllegalArgumentException() {
        System.out.println("--- Exception 1 ---");
        double[] a = new double[]{14, 30, 5, 7, 9, 11, 15};
        Throwable catchThrowable = catchThrowable(() -> LookingForABenefactor.newAvg(a, 2));
        assertThat(catchThrowable).isNotNull();
        assertThat(catchThrowable).isExactlyInstanceOf(IllegalArgumentException.class);

    }
}
