package org.example.part2EdgeOfTheOcean;

import java.util.Arrays;

public class almostIncreasingSequence {
    /**
     * Given a sequence of integers as an array, determine whether it is possible
     * to obtain a strictly increasing sequence by removing no more than one element from the array.
     * <p>
     * Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an.
     * Sequence containing only one element is also considered to be strictly increasing.
     */

    public static boolean solution(int[] sequence) {
        int count = 0;
        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] <= sequence[i - 1]) {
                count++;
                if (count > 1 ||
                        (i > 1 && i < sequence.length - 1
                                && sequence[i] <= sequence[i - 2]
                                && sequence[i + 1] <= sequence[i - 1]))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5, 3, 5, 6};
        System.out.println(solution(sequence));
    }

}
