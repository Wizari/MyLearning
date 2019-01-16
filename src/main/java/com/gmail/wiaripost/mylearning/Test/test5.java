package com.gmail.wiaripost.mylearning.Test;

import com.gmail.wiaripost.mylearning.TestHelper;

public class test5 {
    public static void main(String[] args) {
        int[][] matrix = TestHelper.createField(10, 10, 10);
        int[][] arr = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int sum = 0;

                if (i != 0) {
                    sum += matrix[i - 1][j];
                }
                if (i != matrix.length - 1) {
                    sum += matrix[i + 1][j];
                }
                if (j != 0) {
                    sum += matrix[i][j - 1];
                }
                if (j != matrix[0].length - 1) {
                    sum += matrix[i][j + 1];
                }


                if (i != 0 && j != 0) {
                    sum += matrix[i - 1][j - 1];
                }
                if (i != 10- 1 && j != 10 - 1) {
                    sum += matrix[i + 1][j + 1];
                }
                if (i != 0 && j != matrix[0].length - 1) {
                    sum += matrix[i - 1][j + 1];
                }
                if (i != matrix.length - 1 && j != 0) {
                    sum += matrix[i + 1][j - 1];
                }
                arr[i][j] = sum;
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    arr[i][j] = 9;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(arr[i][j]);
            }

        }


    }

}
