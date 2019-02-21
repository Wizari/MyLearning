package com.gmail.wiaripost.mylearning.EnglishR78;

public class WordAndTranslation {
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

    public WordAndTranslation (String english, String russian) {
        this.english = english;
        this.russian = russian;
    }
}