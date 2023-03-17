package org.example.part2EdgeOfTheOcean;

import java.util.HashMap;
import java.util.Map;

public class commonCharacterCount {
    /**
     * Given two strings, find the number of common characters between them.
     * <p>
     * Example
     * For s1 = "aabcc" and s2 = "adcaa", the output should be
     * solution(s1, s2) = 3.
     */

    public static int solution(String s1, String s2) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int idx = -1;

            if (map.containsKey(ch)) idx = map.get(ch);
            if (s2.indexOf(ch, idx) != -1) {
                count++;
                map.put(ch, s2.indexOf(ch, idx) + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s1 = "abca";
        String s2 = "xyzbac";
        System.out.println(solution(s1, s2));
//        System.out.println(s1.indexOf('a', 1));
    }
}
