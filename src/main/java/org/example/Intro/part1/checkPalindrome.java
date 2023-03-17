package org.example.Intro.part1;

public class checkPalindrome {
    /**
     * Given the string, check if it is a palindrome.
     */

    public static boolean solution(String inputString) {
        int i = 0, j = inputString.length() - 1;
        while (i < j) {
            if (inputString.charAt(i) != inputString.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("asefdsa"));
    }
}
