package codewars7kyu.HappyBirthday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HappyBirthdayTest {
    @Test
    public void test() {
        assertEquals(162, HappyBirthday.wrap(17,32,11));
        assertEquals(124, HappyBirthday.wrap(13,13,13));
        assertEquals(32, HappyBirthday.wrap(1,3,1));
    }
}
