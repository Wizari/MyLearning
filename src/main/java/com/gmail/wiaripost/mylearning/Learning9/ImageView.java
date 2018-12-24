package com.gmail.wiaripost.mylearning.Learning9;

public class ImageView extends View {

    private String src;


    public ImageView(int y, int x) {
        this.setY(y);
        this.setX(x);

    }
    public ImageView() {

    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello i'm ImageView");
    }
}
