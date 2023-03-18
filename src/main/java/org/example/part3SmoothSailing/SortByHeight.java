package org.example.part3SmoothSailing;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortByHeight {
    /**
     * Some people are standing in a row in a park. There are trees between them which cannot be moved.
     * Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
     * People can be very tall!
     * <p>
     * Example
     * <p>
     * For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
     * solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
     */

    public static int[] solution(int[] a) {
        PriorityQueue<Integer> peopleQueue = new PriorityQueue<>();
        for (int i : a) {
            if (i != -1)
                peopleQueue.add(i);
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = peopleQueue.poll();
            }
        }
        return a;
    }

    public static void main(String[] args) {

        int[] input = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] output = solution(input);
        System.out.println(Arrays.toString(output));

    }
}
