package codewars8kyu.AreaOrPerimeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOrPerimeterTest {

    @Test
    void areaOrPerimeterTest(){
        assertEquals(16, AreaOrPerimeter.areaOrPerimeter(4 , 4));
        assertEquals(32, AreaOrPerimeter.areaOrPerimeter(6 , 10));
    }
}
