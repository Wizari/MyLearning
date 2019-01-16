package com.gmail.wiaripost.mylearning.Test;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
//        public static void findMinimumFromArray(int[] array) {
            int [] array = new int[]{5, 1, 3};

//        int[] array = DanzeHelper.inputIntSequenceFromUser();
            Arrays.sort(array);
            int sarray[] = Arrays.copyOf(array, 0);
//        int result = sarray[0];
        int result = 0;
        if (result == 0) {
            result = result + array[0];
        }
//        result = result + array[array.length - 1];
//        int barray [] = new int[0];
//            result = result + sarray[0];
            System.out.println(result);
        }

}

//        barray = sarray [0];

////        int a [] = new int[];
//        String[] strings = DanzeHelper.inputStringSequenceFromUser();
////        Arrays.toString(strings);
//        System.out.println(Arrays.toString(strings));
//    }
//}
