package com.gmail.wiaripost.mylearning.Learning9;

import java.util.ArrayList;
import java.util.List;

public class TestL9 {
    public static void main(String[] args) {


        ImageView imageView1 = new ImageView(100, 100);
//        imageView1.setY(100);
//        imageView1.setX(100);
        imageView1.setHeight(200);
        imageView1.setWidth(200);

        ImageView imageView2 = new ImageView(100, 100);
//        imageView2.setY(100);
//        imageView2.setX(100);
        imageView2.setHeight(200);
        imageView2.setWidth(200);

        TextView textView = new TextView();


        ViewGroup viewGroup = new ViewGroup();


        List<View> views = new ArrayList<>();
        views.add(imageView1);
        views.add(imageView2);
        views.add(viewGroup);
        views.add(textView);

        for (int i = 0; i < views.size(); i++) {

            View view = views.get(i);

            View view2 = new ImageView();

            view2.setX(view.getX());
            view2.setY(view.getY());


            System.out.println();
        }


        for (int i = 0; i < views.size(); i++) {
            System.out.println(views.get(i).getX());
        }

        int yy = 10;

        int xx = yy;
        xx = 20;

    }

    public static ImageView arrangeImage(ImageView imageView1, ImageView imageView2) {
        int x = imageView1.getX() + imageView1.getWidth();
        imageView2.setX(x);
        return imageView2;
    }
}