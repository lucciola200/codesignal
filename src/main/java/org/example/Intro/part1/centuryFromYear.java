package org.example.Intro.part1;

public class centuryFromYear {
    /**
     * Given a year, return the century it is in.
     * The first century spans from the year 1 up to and including the year 100,
     * the second - from the year 101 up to and including the year 200, etc.
     */

    public static int solution(int year) {
        int century = year / 100;
        if (year % 100 != 0) {
            century++;
        }

        return century;
    }

    public static void main(String[] args) {
        System.out.println(solution(1));
    }
}
