package org.example.part2EdgeOfTheOcean;

public class adjacentElementsProduct {
    /**
     * Given an array of integers, find the pair of adjacent
     * elements that has the largest product and return that product.
     * <p>
     * For inputArray = [3, 6, -2, -5, 7, 3], the output should be
     * solution(inputArray) = 21.
     */

    public static int solution(int[] inputArray) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int product = inputArray[i] * inputArray[i+1];
            if (product > maxValue)
                maxValue = product;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println(solution(inputArray));
    }
}
