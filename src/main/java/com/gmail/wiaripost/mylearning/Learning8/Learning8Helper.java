package com.gmail.wiaripost.mylearning.Learning8;


import java.util.ArrayList;

public class Learning8Helper {


    public static ArrayList findAllWriters(ArrayList writers, String find) {
        ArrayList<Writers> writers1 = writers;
        ArrayList<String> list = new ArrayList<String>();
        String findToLower = find.toLowerCase();

        for (int i = 0; i < writers.size(); i++) {
//            String name = new String();
            String name = writers1.get(i).getName();
            String nameLower = name.toLowerCase();
            if (nameLower.contains(findToLower)) {
                list.add(name);
            }
        }
        return list;
    }

    public static ArrayList findWritersAndReturnFoolInformation(ArrayList writers, String find) {
        ArrayList<Writers> writers1 = writers;
        ArrayList<Writers> writersReturn = new ArrayList<>();
        ArrayList<String> list = new ArrayList<String>();
        String findToLower = find.toLowerCase();

        for (int i = 0; i < writers.size(); i++) {
            String name = writers1.get(i).getName();
            String nameLower = name.toLowerCase();
            if (nameLower.contains(findToLower)) {
                writersReturn.add(writers1.get(i));
            }
        }
        return writersReturn;
    }
}
