package com.company.recursion;

import java.util.Arrays;

public class JaggedArray {
    static int rows = 5;

    public static void main(String[] args) {
        int[][] arr = new int[rows][];
        for (int i = rows; i > 0; i--) {
            arr[rows - i] = new int[i];
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 5 - i; j++) {
                arr[i][j] = j + 1;
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


    }
}
