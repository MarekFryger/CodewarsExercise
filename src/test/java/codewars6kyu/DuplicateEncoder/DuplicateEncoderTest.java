package codewars6kyu.DuplicateEncoder;

import org.junit.jupiter.api.Test;

import static codewars6kyu.DuplicateEncoder.DuplicateEncoder.encode;
import static org.assertj.core.api.Assertions.assertThat;

public class DuplicateEncoderTest {
    @Test
    void encodeTest(){
        assertThat(encode("din")).isEqualTo("(((");
        assertThat(encode("recede")).isEqualTo("()()()");
        assertThat(encode("Success")).isEqualTo(")())())");
        assertThat(encode("(( @")).isEqualTo("))((");
    }
}
