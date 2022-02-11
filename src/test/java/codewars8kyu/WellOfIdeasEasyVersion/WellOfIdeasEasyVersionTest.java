package codewars8kyu.WellOfIdeasEasyVersion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WellOfIdeasEasyVersionTest {
    @Test
    public void wellOfIdeasEasyVersionTests() {
        assertEquals("Fail!", WellOfIdeasEasyVersion.well(new String[] {"bad", "bad", "bad"}));
        assertEquals("Publish!", WellOfIdeasEasyVersion.well(new String[] {"good", "bad", "bad", "bad", "bad"}));
        assertEquals("I smell a series!", WellOfIdeasEasyVersion.well(new String[] {
                "good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"}));
    }
}
