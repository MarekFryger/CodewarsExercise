package codewars5kyu.Scramblies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScramblesTest {
    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests scramble");
        testing(Scrambles.scramble("rkqodlw","world"), true);
        testing(Scrambles.scramble("cedewaraaossoqqyt","codewars"),true);
        testing(Scrambles.scramble("katas","steak"),false);
        testing(Scrambles.scramble("scriptjavx","javascript"),false);
        testing(Scrambles.scramble("scriptingjava","javascript"),true);
        testing(Scrambles.scramble("scriptsjava","javascripts"),true);
        testing(Scrambles.scramble("javscripts","javascript"),false);
        testing(Scrambles.scramble("aabbcamaomsccdd","commas"),true);
        testing(Scrambles.scramble("commas","commas"),true);
        testing(Scrambles.scramble("sammoc","commas"),true);
    }
}
