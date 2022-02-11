package codewars7kyu.GetTheMiddleCharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTheMiddleCharacterTest {
    @Test
    public void evenTests() {
        assertEquals("es", GetTheMiddleCharacter.getMiddle("test"));
        assertEquals("dd", GetTheMiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", GetTheMiddleCharacter.getMiddle("testing"));
        assertEquals("A", GetTheMiddleCharacter.getMiddle("A"));
    }
}
