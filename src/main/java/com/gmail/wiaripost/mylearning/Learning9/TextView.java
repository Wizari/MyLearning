package com.gmail.wiaripost.mylearning.Learning9;

public class TextView extends View {


    private String text;


    public TextView() {

    }

    @Override
    public void sayHello() {
        System.out.println("Hello i'm TextView");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
