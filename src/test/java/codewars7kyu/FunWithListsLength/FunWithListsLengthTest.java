package codewars7kyu.FunWithListsLength;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunWithListsLengthTest {

    @Test
     void basicTests() {
        assertEquals(0, FunWithListsLength.length(null));
        assertEquals(4, FunWithListsLength.length(new Node(1,new Node(2,new Node(3,new Node(4,null))))));
    }
}
