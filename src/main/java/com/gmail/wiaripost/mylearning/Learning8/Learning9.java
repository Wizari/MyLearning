package com.gmail.wiaripost.mylearning.Learning8;


import java.util.ArrayList;
import java.util.Scanner;

public class Learning9 {


    public static void main(String[] args) {
        ArrayList<Writers> writersList = createWritersList();
        Scanner scan = new Scanner(System.in);
        System.out.println("Пойск писателей");
        System.out.println("ВВедите 1 для получения результата в виде имени и фамилли ");
        System.out.println("ВВедите 2 для получение полной информации по найденуму писателю ");
        System.out.print(": ");
        int scan1 = scan.nextInt();

        switch (scan1) {
            case 1:
                System.out.println("Кого найти?");
                Scanner scan2 = new Scanner(System.in);
                System.out.print(": ");
                String find = scan2.nextLine();
                ArrayList<String> list = Learning8Helper.findAllWriters(writersList, find);
                System.out.println(list);

                break;
            case 2:

                System.out.println("Кого найти?");
                System.out.print(": ");
                Scanner scan3 = new Scanner(System.in);
                String find3 = scan3.nextLine();
                ArrayList<String> list3 = Learning8Helper.findWritersAndReturnFoolInformation(writersList, find3);
                System.out.println(list3);

                break;
            default:
                System.out.println("НЕТ, такого слова!");
                break;
        }
    }

    private static ArrayList createWritersList() {
        ArrayList<Writers> list = new ArrayList<>();

        Writers writersTest = new Writers("Тягомотин", 1);
        Writers writersTest2 = new Writers("Тряпкокунов", 2);
        Writers writersTest3 = new Writers("Алогичнов", 3);
        Writers writersTest4 = new Writers("Михаил Булгаков", 4);
        Writers writersTest5 = new Writers("Александр Сергеевич Пушкин", 5);
        Writers writersTest6 = new Writers("Лев Николаевич Толстой", 6);
        Writers writersTest7 = new Writers("Николай Васильевич Гоголь", 7);
        Writers writersTest8 = new Writers("Чехов Антон Павлович", 8);
        Writers writersTest9 = new Writers("Максим Горький", 9);

        list.add(writersTest);
        list.add(writersTest2);
        list.add(writersTest3);
        list.add(writersTest4);
        list.add(writersTest5);
        list.add(writersTest6);
        list.add(writersTest7);
        list.add(writersTest8);
        list.add(writersTest9);

        return list;
    }

}
