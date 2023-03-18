package org.example.part3SmoothSailing;

public class reverseInParentheses {
    /**
     * Write a function that reverses characters in (possibly nested) parentheses in the input string.
     * <p>
     * Input strings will always be well-formed with matching ()s.
     * <p>
     * Example
     * <p>
     * For inputString = "(bar)", the output should be
     * solution(inputString) = "rab";
     * For inputString = "foo(bar)baz", the output should be
     * solution(inputString) = "foorabbaz";
     * For inputString = "foo(bar)baz(blim)", the output should be
     * solution(inputString) = "foorabbazmilb";
     * For inputString = "foo(bar(baz))blim", the output should be
     * solution(inputString) = "foobazrabblim".
     * Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
     */

    public static String solution(String inputString) {
        if (inputString.isEmpty()) return inputString;
        int end = inputString.indexOf(")");
        int start = end != -1 ? inputString.substring(0, end).lastIndexOf("(") : -1;

        while (start != -1 && end != -1) {
            String reverse = new StringBuilder(inputString.substring(start + 1, end)).reverse().toString();
            inputString = inputString.substring(0, start) + reverse + inputString.substring(end + 1);
            end = inputString.indexOf(")");
            start = end != -1 ? inputString.substring(0, end).lastIndexOf("(") : -1;
        }
        return inputString;
    }

    public static void main(String[] args) {
//        String inputString = "foo(bar(baz))blim";
        String inputString = "foobaz";
        System.out.println(solution(inputString));
    }
}
