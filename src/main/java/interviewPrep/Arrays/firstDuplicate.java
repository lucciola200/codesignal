package interviewPrep.Arrays;

import java.util.HashSet;
import java.util.Set;

public class firstDuplicate {
    /**
     * Given an array a that contains only numbers in the range from 1 to a.length,
     * find the first duplicate number for which the second occurrence has the minimal index.
     * In other words, if there are more than 1 duplicated numbers, return the number for which
     * the second occurrence has a smaller index than the second occurrence of the other number does.
     * If there are no such elements, return -1.
     */

    public static int solution(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (set.contains(a[i])) {
                return a[i];
            }
            set.add(a[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 2};
        System.out.println(solution(a));
    }
}
