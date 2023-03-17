package org.example.part2EdgeOfTheOcean;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
    /**
     * Ratiorg got statues of different sizes as a present from CodeMaster for his birthday,
     * each statue having an non-negative integer size. Since he likes to make things perfect,
     * he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one
     * exactly by 1.
     * He may need some additional statues to be able to accomplish that.
     * Help him figure out the minimum number of additional statues needed.
     */

    public static int solution(int[] statues) {
        Arrays.sort(statues);
        int countOfStatues = 0;
        for (int i = 0; i < statues.length - 1; i++) {
            int count = statues[i + 1] - statues[i];
            countOfStatues += count > 1 ? count - 1 : 0;
        }
        return countOfStatues;
    }

    public static void main(String[] args) {
        int[] statues = {6, 2, 3, 8};
        System.out.println(solution(statues));
    }
}
