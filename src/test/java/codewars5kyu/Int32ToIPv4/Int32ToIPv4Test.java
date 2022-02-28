package codewars5kyu.Int32ToIPv4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Int32ToIPv4Test {
    @Test
    public void sampleTest() {
        assertEquals("128.114.17.104", Int32ToIPv4.longToIP(2154959208L));
        assertEquals("0.0.0.0", Int32ToIPv4.longToIP(0));
        assertEquals("0.0.0.32", Int32ToIPv4.longToIP(32));
        assertEquals("0.0.1.0", Int32ToIPv4.longToIP(256));
        assertEquals("128.32.10.1", Int32ToIPv4.longToIP(2149583361L));

    }
}
