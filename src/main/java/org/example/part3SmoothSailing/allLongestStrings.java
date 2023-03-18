package org.example.part3SmoothSailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class allLongestStrings {
    /**
     * Given an array of strings, return another array containing all of its longest strings.
     */

    public static String[] solution(String[] inputArray) {
        List<String> output = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            String str = inputArray[i];
            if (str.length() > maxLength) {
                output.clear();
                maxLength = str.length();
            }

            if (str.length() == maxLength)
                output.add(str);
        }
        return output.toArray(new String[output.size()]);
    }

    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        String[] outputArray = solution(inputArray);
        System.out.println(Arrays.asList(outputArray).toString());
    }
}
