package com.gmail.wiaripost.mylearning;
//Определить минимальное число из введенной с клавиатуры последовательности
//Написать программу, которая определяет минимальное число из введенной с клавиатуры
// последовательности.
//Закончить последовательность - введением 0. За min принять первое число
// введеное с клавиатуры.(min - переменная)

import com.gmail.danze.framework.DanzeHelper;
import java.util.Arrays;
import java.util.Scanner;
public class LearningSEls24 {
    public static void main(String[] args) {
        System.out.print("введите миниматьное число:");
        Scanner smin = new Scanner(System.in);
        Scanner sstop = new Scanner(System.in);
        int min  = smin.nextInt();
        String stop = sstop.nextLine();
//        while(sc.hasNext() && !s1.equals("exit")) {
            if (stop.equals("exit")) {
                System.out.println(min);
            }
//        System.out.println(min);
        }


}



     //  int[] numbers = DanzeHelper.inputNumbers(10);
//        int[] numbers = DanzeHelper.inputNumbersZeroForExit();

//        System.out.println("Вы ввели: " + DanzeHelper.arrayToString(numbers));
////        System.out.print("Введите последовательность чисел");
//        Scanner scan = new Scanner(System.in);
//        String sb = "";
//
//        for (; ; ) {

//            int n = scan.nextInt();
//            sb = (sb + " " + n);
//            System.out.println(n);
 //if (n == 0){
// break;
// }
//        }

/*        String sb = "";
        while (true) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            sb = (sb + " " + n);

            if(scan.next() != " 0") {
                break;
            }
            System.out.println(n);
}
//        System.out.println(n);
        System.out.println(sb);
*/
//        StringBuffer sb = new StringBuffer();
//        for (int x = 0; 0 != scan.nextInt(); x++ ) {
//            int number = scan.nextInt();
//            sb.insert(0, number + " ");
////            sb.append(number);


//        }
//        System.out.println(sb);
//    }
//}





//        String[] arr = new String[Integer.MAX_VALUE];
//        Scanner scan = new Scanner(System.in);
//        String input;
//        int i = 0;
//        do {
//            input = scan.nextLine();
//            arr[i++] = input;
//        } while (!input.equals("exit"));
//        arr[--i] = null;

