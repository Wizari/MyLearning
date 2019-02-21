package com.gmail.wiaripost.mylearning.Test;

import java.util.Arrays;


public class Test9 {
    public static void main(String[] args) {


        String str = "!The::urn was? %then::carried, for several rounds around the cremation site, for the last leg of the procession.";
//    String[] results = text.split("\\W+");
//        String[] results = text.split("[ \n\t\r:;{]");//("[ \n\t\r.,;:!?{]");
//
//        System.out.println(Arrays.toString(results));
//        if (results.isNotEmpty(results[1])) {
//            System.out.println(results[1] + "null");
//        }
//        System.out.println(results[1] + "11");
//        String line = "!Add Hello World::Привет мир::3";
        String line = "!Add Hello World::Привет мир::3";

//        String firstWord = str.substring(0, str.indexOf("::"));
//        String firstWord1 = line.substring(line.indexOf("::")+2, line.length());
//        String firstWord2 = line.substring(line.indexOf("::")+2, line.indexOf("::"));
        String ruWord = line.substring(line.indexOf("::") + 2, line.length());
        String ruR = ruWord.substring(0, ruWord.indexOf("::"));
        final String answer = "Tom is my friend";
        final String source = "Tom is my friend";
        final String source3 = "Tom'`s my friend ";
//        final String answer = "Are is going to Tom's party?";
////        final String answer = "Are you going to Tom's party?";
//        final String source = "Are you going to Tom's party?";

        String compareAnswer = answer.toLowerCase();

        String answerToLower = answer.toLowerCase();
        String sourceToLower = source.toLowerCase();

        StringBuilder answerBuilder = new StringBuilder(answerToLower);
        StringBuilder sourceBuilder = new StringBuilder(sourceToLower);

        String[] results = answer.split("\\W+");
        String[] results1 = source.split("\\W+");
        String[] results3 = source3.split("\\W+");//("[ \n\t\r.,;:!?{]");

        System.out.println(Arrays.toString(results3));
        System.out.println(results3[2 - 1].length());

        System.out.println(Arrays.toString(results));
        System.out.println(Arrays.toString(results1));
//        System.out.println(answerBuilder);
//        System.out.println(answer.equals(source));
        if (Arrays.equals(results, results1)) {
            System.out.println("йа");
        }


//        String str = "Привет, java-программист!";

        int indexM = str.indexOf("::"); // Нахождение символа в строке
        int indexJava = str.indexOf("java"); // Нахождение слова в строке

//        if(indexM == - 1) {
//            System.out.println("Символ \"м\" не найден.");
//        } else {
//            System.out.println("Символ \"м\" найден в индексе " + indexM);
//        }
//
//        if(indexJava == - 1) {
//            System.out.println("Слово \"java\" не найдено.");
//        } else {
//            System.out.println("Слово \"java\" найдено в индексе " + indexJava);
//        }
    }
}
