package com.gmail.wiaripost.mylearning;

import com.sun.deploy.util.ArrayUtil;
//import java.utils.Arrays;

import java.lang.*;
import java.util.Random;

public class TestHelper {
    /**
     * Метод создает двумерный пустой массив с запрошенымколичеством рандомно расставлннызх едениц
     * @param fieldLength длинна матрицы
     * @param fieldHeight ширина матрицы
     * @param amountMines Количество 1
     * @return заполненная матрица
     */
    public static int[][] createField(int fieldLength, int fieldHeight, int amountMines) {
        int[][] arr = new int[fieldLength][fieldHeight];
        int mines = amountMines;
        for (int i = 0; i < mines; i++) {
            int l = TestHelper.generateRandom(0, fieldLength - 1);
            int h = TestHelper.generateRandom(0, fieldHeight - 1);

            arr[h][l] += 1;
            if (arr[h][l] == 2) {
                arr[h][l] = 1;
                mines++;
            }
        }
        return arr;
    }

    public static int generateRandom(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        Random rnd = new Random();
        int number = min + rnd.nextInt(max - min + 1);
        return number;
    }

    public static int[] generateRandomUnique(int min, int max, int quantity) {
        int[] arr = new int[quantity];
        for (int i = 0; i < quantity ; i++) {
            arr[i] = generateRandom(min, max);
            if (i != 0) {
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        arr[i] = 0;
                        i--;
                    }
                }
            }

            
        }
        return arr;
    }
    /**
     * Метод заполняет не занятые минами ячейки, числами равными количеству мин находящихся вокруг ячейки
     * @param matrix матрица где мины обозначены числами > 8, пустные ячейки обозначены 0
     * @return заполненная матрица
     */
    public static int[][] calculateField(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i != 0) {
                    arr[i][j] += matrix[i - 1][j];
                }
                if (i != 0 || j != 0) {
                    arr[i][j] += matrix[i - 1][j - 1];
                }
                if (i != matrix[0].length - 1 || j != matrix.length - 1) {
                    arr[i][j] += matrix[i - 1][j + 1];
                }
                if (i != matrix.length - 1) {
                    arr[i][j] += matrix[i + 1][j];

                }
                if (i != matrix.length - 1 || j != 0) {
                    arr[i][j] += matrix[i + 1][j - 1];
                }
                if (i != matrix.length - 1 || j != matrix[0].length - 1) {
                    arr[i][j] += matrix[i + 1][j + 1];
                }
                if (j != 0) {
                    arr[i][j] += matrix[i][j - 1];
                }
                if (j != matrix[0].length - 1) {
                    arr[i][j] += matrix[i][j + 1];
                }

            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix [i][j] == 1) {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }

    public static int stringToChar(String string, int i) {
        int codePoint = Character.codePointAt(string, i);
        return codePoint;
    }

    public static int[] stringToCharArr(String inputString) {
        int [] arr = new int[inputString.length()];
        for (int i = 0; i < inputString.length() ; i++) {
            arr[i] = (TestHelper.stringToChar(inputString, i));
        }
        return arr;
    }

//    public static ArrayList shuffleArrayList(ArrayList numbers, int count) {
//        if (count < numbers.size() * 2) {
//            count = numbers.size() * 2;
//        }
//        for (int i = 0; i < count; i++) {
//            int i1 = SapperHelper.generateRandom(0, numbers.size() - 1);
//            int i2 = SapperHelper.generateRandom(0, numbers.size() - 1);
//            ArrayList temp = (ArrayList) numbers.get(i1);
//            numbers.set(i1, numbers.get(i2));
//            numbers.set(i2, temp);
//        }
//        return numbers;
//    }


//    public static ArrayList generateRandomNumbers(int fieldLength, int fieldHeight, int amountMines) {
//        List<Integer> arr = new ArrayList(fieldLength*fieldHeight);
//
//        for (int i = 0; i < arr.size(); i++) {
////            arr.
//
//        }
//
//
//        return null;
//    }
}
