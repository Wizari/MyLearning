package com.gmail.wiaripost.mylearning.Test;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> myList = new ArrayList<String>();

        for (; ; ) {
            String a = scan.nextLine();
            myList.add(a);
            if (a.equals("q")) {
                String[] y = myList.toArray(new String[0]);
                String x[] = Arrays.copyOf(y, y.length - 1);
                int [] result = new int[x.length];
                for(int i =0;i<result.length;i++)
                    result[i] = Integer.parseInt(x[i].trim());
                System.out.println(Arrays.toString(result));
                break;
            }
//            System.out.println(Arrays.toString(result));
//                String[] y = myList.toArray(new String[0]);
//                String x[] = Arrays.copyOf(y, y.length - 1);
//                int[] ret = new int[myList.size()-1];
//                Iterator<String> iterator = myList.iterator();
//                for (int i = 0; i < ret.length; i++)
//                {
////                    ret[i] = iterator.next().intValue();
//                }
//                System.out.println(Arrays.toString(result));
//            }
        }
//        System.out.println(Arrays.toString(result));
    }
}