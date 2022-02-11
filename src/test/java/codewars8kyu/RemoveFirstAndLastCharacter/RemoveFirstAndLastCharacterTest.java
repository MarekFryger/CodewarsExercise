package codewars8kyu.RemoveFirstAndLastCharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveFirstAndLastCharacterTest {
    @Test
    void removeFirstAndLastCharacterTest(){
        assertEquals("loquen",RemoveFirstAndLastCharacter.removeFirstAndLast("eloquent"));
        assertEquals("ountr", RemoveFirstAndLastCharacter.removeFirstAndLast("country"));
        assertEquals("erso", RemoveFirstAndLastCharacter.removeFirstAndLast("person"));
        assertEquals("lac", RemoveFirstAndLastCharacter.removeFirstAndLast("place"));
    }
}
