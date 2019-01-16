package com.gmail.wiaripost.mylearning.Test;

import com.gmail.danze.framework.DanzeHelper;
import com.gmail.wiaripost.mylearning.User;

public class Test {
    public static void main(String[] args) {
//        String a = "something";
//        String b = new StringBuffer(a).reverse().toString();
//        System.out.print(b);


        User u1 = new User();
        u1.setName("u1");
        User u2 = new User();
        u2.setName("u1");
        System.out.println(u1.equals(u2));
        String  sb;


        char ch = 64;
        int i = ch + 2;
        char ch2 = (char) i;

        System.out.println("fds");
        for (int j = 10; j < 100; j++) {
            int[] dividers = DanzeHelper.finAllDividers(j);
//            boolean isEven = DanzeHelper.checkEvenDivider(dividers);
//            if (isEven) {
//                System.out.println("Число " + j + "имеет четную сумму делителей");
//            }


        }


    }
}
