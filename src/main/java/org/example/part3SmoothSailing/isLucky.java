package org.example.part3SmoothSailing;

public class isLucky {
    /**
     * Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum
     * of the first half of the digits is equal to the sum of the second half.
     * <p>
     * Given a ticket number n, determine if it's lucky or not.
     * <p>
     * Example
     * <p>
     * For n = 1230, the output should be
     * solution(n) = true;
     * For n = 239017, the output should be
     * solution(n) = false.
     */

    public static boolean solution(int n) {
        String number = String.valueOf(n);
        int sum = 0, sum2 = 0, left = 0, right = number.length() - 1;
        while (left < right) {
            sum += Integer.valueOf(number.charAt(left++));
            sum2 += Integer.valueOf(number.charAt(right--));
        }
        return sum == sum2;
    }

    public static void main(String[] args) {
        System.out.println(solution(1230));
    }
}
