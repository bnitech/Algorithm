package com.bnitech;

import com.bnitech.leetcode.Q_73.Solution;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        Solution.setZeroes(matrix);
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
