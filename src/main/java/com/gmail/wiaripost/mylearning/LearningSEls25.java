package com.gmail.wiaripost.mylearning;

public class LearningSEls25 {

    public static void main(String[] args) {
        String pack = "1234567890";
        char[] cArr = pack.toCharArray();
        int add = cArr.length % 2;
        char[] temp = new char[(((cArr.length / 2) + add) + 1)];
        char[] temp2 = new char[((cArr.length / 2) + 1)];

        int t = 0;
        for (int b = 0; t < temp.length - 1; b += 2) {
            t++;
            temp[t] = cArr[b];
        }
        System.out.println(temp);
        int t2 = 0;
        for (int b2 = 1; t2 < temp2.length - 1; b2 += 2) {
            t2++;
            temp2[t2] = cArr[b2];
        }
        System.out.println(temp2);
    }
}

//            if (t == temp.length) {
//                System.out.println(temp);

//            }
//        ArrayList<Character> temp = new ArrayList<>((pack.length()/2+add));
//        ArrayList<Character> temp2 = new ArrayList<>((pack.length()/2));
//        for (int b = 1; b <= cArr.length - 1; b += 2) {
//            for (int t = 0; t <= temp2.length - 1; t++)
//                temp2[t] = cArr[b];
//            if (b <= cArr.length-1){
//                System.out.println(temp2);
//            }

//            System.out.println(temp2);

//        }
//    }


//        System.out.println(aa);
//        int a = (pack.length()/2)%2;
//        if ((pack.length()/2)%2 == 0);{
//            int add =
//        }
//        if ((pack.length()/2)%2 != 0);{
//
//        }

//        String pack = "abcde1234567";
//        char[] chars = pack.toCharArray();
//        String s1 = "";
//        String s2 = "";
//        for (int i = 0; i < pack.length() - 1; i += 2) {
//        }
//        System.out.println(s1);
//        System.out.println(s2);
//    }
//
//
//    public static void oldmain(String[] args) {
//        String pack = "abcde123456";
//        char[] cArr = pack.toCharArray();
//        char[] temp = new char[pack.length()/2];
//        char[] temp2 = new char[pack.length()/2];
//        ArrayList<Character> ch1 = new ArrayList<>();
//
//        for (int i = 0; i >= cArr.length - 1; i = i + 2) {
//            for (int t = 0; t >= cArr.length - 1; t++) {
//                ch1.add(cArr[i]);
//            }
//        }
//        for (int b = 0; b >= cArr.length - 1; b = b + 2) {
//            for (int t = 0; t >= cArr.length - 1; t++)
//                temp2[t] = cArr[b];
//            System.out.println(temp2);
//        }
//
//    }
//

//        for (int i = 0; 0 < pack.length() - 1; i++) ;
//        {
//            for (int i=0;0 < pack.length()-1;i++ );{
//
//            temp = array[x];
//        }
//            {
//            }


//            if (number % 2 != 0);

//        char[] cArr = pack.toCharArray();
//        System.out.println(cArr);


//        char cPack = pack.valueOf(cPack);
//        System.out.println(cPack);
//        pack.valueOf(cPack);
