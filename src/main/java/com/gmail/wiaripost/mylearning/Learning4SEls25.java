package com.gmail.wiaripost.mylearning;

import com.gmail.danze.framework.DanzeHelper;

import javax.swing.*;
import java.util.Random;

public class Learning4SEls25 {


//    public static String reverseLine(String line) {
//        String result = new StringBuffer(line).reverse().toString();
//        return result;
//    }
//
//
//
//    public static int  generateRandom(int min, int max) {
//        Random rnd = new Random();
//        int number = min + rnd.nextInt(max - min + 1);
//        return number;
//    }




    public static void main(String[] args) {

        for (String arg : args) {
            System.out.println(arg);
        }

//        String g = "abcdxyz";

        User user2 = new User();
        user2.setAge(15);
        System.out.println(user2.getAge());

        User user1 = new User();
        user1.setAge(85);
        user1.setName("Ivan");
        user1.setGender(false);

        System.out.println(user1.getAge());
        System.out.println(user1.getName());
        // check();
//        JFrame frame = new JFrame("Ветклиника");
//        frame.setSize(800, 600);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setVisible(true);

//        System.out.println(com.gmail.danze.framework.DanzeHelper.reverseLine("Ivan"));
//        System.out.println(DanzeHelper.generateRandom(10, 100));

//        for (int i = 0; i < 20; i++) {
//            System.out.print(generateRandom(2, 8) + " ");
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("i" + i);
//            for (int j = 0; j < 10; j++) {
//                System.out.println("j" + i);
//                for (int k = 0; k < 10; k++) {
//                    System.out.println("k" + i);
//                }
//            }
//        }

//        String s = reverseLine(g);

//        System.out.println(s);
//        System.out.println(reverseLine("Ivan"));
//        System.out.println(reverseLine("Igor"));
//        System.out.println(reverseLine("Konstantin"));



//        String c = new StringBuffer(g).reverse().toString();
//        System.out.println(c);
//
//
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 44, 256};
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            int x = arr[i];
//            System.out.print(x + " ");
//        }
//        /* Проверил что на Sring работает*/
//        {
//            String[] barr = {"21", "22", "23", "24", "25", "26", "27", "28", "29", "210", "211", "244", "2256"};
//            System.out.println("\n");
//            for (int i = barr.length - 1; i >= 0; i--) {
//                String x = barr[i];
//                System.out.print(x + " ");
//            }
//        }

    }
}
