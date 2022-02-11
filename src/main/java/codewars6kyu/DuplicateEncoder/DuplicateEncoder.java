package codewars6kyu.DuplicateEncoder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateEncoder {
    static String encode(String word) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        word = word.toLowerCase();
        char[] chars = word.toCharArray();
        for (char c : chars) {
            set.add(c);
        }
        for (char c : set) {
            map.put(c, 0);
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                Integer integer = map.get(chars[i]);
                map.put(chars[i], integer + 1);
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) > 1) {
                chars[i] = ')';
            } else {
                chars[i] = '(';
            }
        }
        word = String.valueOf(chars);
        return word;
    }
}
