package org.example.part2EdgeOfTheOcean;

public class shapeArea {
    /**
     * Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
     */

    public static int solution(int n) {
        if (n == 1)  return 1;
        return n * n + (n - 1) * (n - 1);
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}
