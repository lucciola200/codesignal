package org.example.part2EdgeOfTheOcean;

public class matrixElementsSum {
    /**
     *
     */
    public static int solution(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array[0].length; i++) {
            int sumInner = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] == 0) {
                    break;
                }
                sumInner += (array[j][i]);
            }
            sum += sumInner;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 0},
                {0, 5, 0, 1},
                {2, 1, 3, 10}};
        System.out.println(solution(matrix));
    }
}
