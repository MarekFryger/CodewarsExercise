package codewars7kyu.VowelCount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelCountTest {
    @Test
    public void testCase1() {
        assertEquals( 5, VowelCount.getCount("abracadabra"));
    }
}
