package com.gmail.wiaripost.mylearning.Learning10;

import com.gmail.wiaripost.mylearning.TestHelper;

public class test {
    public static void main(String[] args) {
//        TestHelper.stringToChar();
        String name = "ЯСaterpillar";
        String soutName = new String();
        for (int i = 0; i < name.length() ; i++) {
            soutName += (TestHelper.stringToChar(name, i)+ ", ");
//            System.out.print(TestHelper.stringToChar(name, i)+" , ");

        }
        System.out.println(soutName);
//        System.out.println(" ");
        String name2 = " Caterpillar";
        String soutName2 = new String(" ");
        for (int i = 0; i < name2.length() ; i++) {
            soutName2 += (TestHelper.stringToChar(name2, i)+ ", ");
//            System.out.print(TestHelper.stringToChar(name, i)+" , ");

        }
        System.out.println(soutName2);

        int[] arr = TestHelper.stringToCharArr(name);
        int[] arr2 = TestHelper.stringToCharArr(name2);
        for (int i = 0; i < name.length(); i++) {
            System.out.print(arr[i]+ " ");
            System.out.println(arr2[i]);
        }


//        Сaterpillar();
//        Caterpillar
    }
}
