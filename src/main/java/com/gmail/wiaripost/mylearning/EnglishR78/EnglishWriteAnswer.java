package com.gmail.wiaripost.mylearning.EnglishR78;

import com.gmail.wiaripost.mylearning.TestHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EnglishWriteAnswer {
    public static void main(String[] args) {
//        ArrayList<String> arr = new ArrayList<>();
        ArrayList<WordAndTranslation> arr = new ArrayList<>();
        arr.add(new WordAndTranslation("be happy", "быть счастливым"));
        arr.add(new WordAndTranslation("be hungry / starving", "быть голодным"));
        arr.add(new WordAndTranslation("be sick", "быть больным"));
        arr.add(new WordAndTranslation("be well","быть здоровым (или чувствовать себя хорошо)"));
        arr.add(new WordAndTranslation("be ready","быть готовым"));
        arr.add(new WordAndTranslation("be late","опаздывать"));
        arr.add(new WordAndTranslation("be sorry","сожалеть"));
        arr.add(new WordAndTranslation("be sure","быть уверенным"));
        arr.add(new WordAndTranslation("be angry","сердиться"));
        arr.add(new WordAndTranslation("be busy","быть занятым"));
        arr.add(new WordAndTranslation("be away", "отсутствовать"));
        arr.add(new WordAndTranslation("be back", "возвращаться"));
        arr.add(new WordAndTranslation("be confused", "быть в замешательстве"));
        arr.add(new WordAndTranslation("be frustrated", "быть разочарованным"));
        arr.add(new WordAndTranslation("be surprised", "быть удивленным"));
        arr.add(new WordAndTranslation("be shocked", "быть шокированным"));
        arr.add(new WordAndTranslation("be interested in", "интересоваться"));
        arr.add(new WordAndTranslation("be crazy", "быть без ума"));
        arr.add(new WordAndTranslation("be cold", "замерзать (простудиться)"));
        arr.add(new WordAndTranslation("be hot (warm)", "быть горячим (тёплым). Либо в смысле быть привлекательным, сексуальным (hot girl = sexy girl)"));
        arr.add(new WordAndTranslation("be tired", "быть усталым"));
        arr.add(new WordAndTranslation("be on time", "быть вовремя"));
        arr.add(new WordAndTranslation("be right", "быть правым"));
        arr.add(new WordAndTranslation("be wrong", "быть неправым"));
        arr.add(new WordAndTranslation("be online", "быть онлайн"));
        arr.add(new WordAndTranslation("be available", "быть доступным"));
        arr.add(new WordAndTranslation("be invisible", "быть невидимым"));
        arr.add(new WordAndTranslation("be offline", "быть оффлайн"));



        int[] random = TestHelper.generateRandomUnique(0, (arr.size()-1), 4);
        int randomQuestion = random[TestHelper.generateRandom(0, (random.length-1))];

        System.out.println(arr.get(randomQuestion).getRussian());
        System.out.println(arr.get(random[0]).getEnglish());
        System.out.println(arr.get(random[1]).getEnglish());
        System.out.println(arr.get(random[2]).getEnglish());
        System.out.println(arr.get(random[3]).getEnglish());

        Scanner s = new Scanner(System.in);
        String scaner = s.nextLine();
        String temp = arr.get(randomQuestion).getEnglish();
        if (scaner.equals(temp)) {
            System.out.println("Yeah Bitch! ＼(￣▽￣)／");
        }
        else {
            System.out.println("Неа  .｡･ﾟﾟ･(＞_＜)･ﾟﾟ･｡." + "Правильный ответ: " + temp);
        }

    }
}
 class WordAndTranslation {
    private String english;
    private String russian;

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    public WordAndTranslation(String english, String russian) {
        this.english = english;
        this.russian = russian;
    }
}



//        String text = "The `urn` (was) %then carried for several rounds around the cremation site, for the last leg of the procession.";
////        String[] results = text.split("\\W+");
//        String[] results = text.split("[ \n\t\r.,;:!?{]");
//
//        System.out.println(Arrays.toString(results));



//        int[] x2 = TestHelper.generateRandomUnique(0, arr.size(), 4);
//        int[] x3 = TestHelper.generateRandomUnique(0, arr.size(), 4);
//        int[] x4 = TestHelper.generateRandomUnique(0, arr.size(), 4);
//        int[] x5 = TestHelper.generateRandomUnique(0, arr.size(), 4);
//
//                System.out.println(x[0]+" "+x[1]+" "+x[2]+" "+x[3]);
//        System.out.println(x2[0]+" "+x2[1]+" "+x2[2]+" "+x2[3]);
//        System.out.println(x3[0]+" "+x3[1]+" "+x3[2]+" "+x3[3]);
//        System.out.println(x4[0]+" "+x4[1]+" "+x4[2]+" "+x4[3]);
//        System.out.println(x5[0]+" "+x5[1]+" "+x5[2]+" "+x5[3]);


//        arr.add("be happy быть счастливым");
//        arr.add("be hungry / starving быть голодным");
//        arr.add("be sick быть больным");
//        arr.add("be well быть здоровым (или чувствовать себя хорошо)");
//        arr.add("be ready быть готовым");
//        arr.add("be late опаздывать");
//        arr.add("be sorry сожалеть");
//        arr.add("be sure быть уверенным");
//        arr.add("be angry сердиться");
//        arr.add("be busy быть занятым");
//        arr.add("be away отсутствовать");
//        arr.add("be back возвращаться");
//        arr.add("be confused быть в замешательстве");
//        arr.add("be frustrated быть разочарованным");
//        arr.add("be surprised быть удивленным");
//        arr.add("be shocked быть шокированным");
//        arr.add("be interested in интересоваться");
//        arr.add("be crazy быть без ума");
//        arr.add("be cold замерзать (простудиться)");
//        arr.add("be hot (warm) быть горячим (тёплым). Либо в смысле быть привлекательным, сексуальным (hot girl = sexy girl)");
//        arr.add("be tired быть усталым");
//        arr.add("be on time быть вовремя");
//        arr.add("be right быть правым");
//        arr.add("be wrong быть неправым");
//        arr.add("be online быть онлайн");
//        arr.add("be available быть доступным");
//        arr.add("be invisible быть невидимым");
//        arr.add("be offline быть оффлайн");
