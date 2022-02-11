package codewars6kyu.ConvertStringToCamelCase;

import org.junit.jupiter.api.Test;


import static codewars6kyu.ConvertStringToCamelCase.ConvertStringToCamelCase.toCamelCase;
import static org.assertj.core.api.Assertions.assertThat;


public class ConvertStringToCamelCaseTest {

    @Test
    void toCamelCaseTest(){
        assertThat(toCamelCase("the-stealth-warrior")).isEqualTo("theStealthWarrior");
        assertThat(toCamelCase("The_Stealth_Warrior")).isEqualTo("TheStealthWarrior");
    }
}

