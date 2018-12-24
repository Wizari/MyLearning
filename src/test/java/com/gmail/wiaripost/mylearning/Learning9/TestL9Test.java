package com.gmail.wiaripost.mylearning.Learning9;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestL9Test {

    @Test
    public void arrangeImage1() {
        ImageView imageView1 = new ImageView();
        imageView1.setY(100);
        imageView1.setX(100);
        imageView1.setHeight(200);
        imageView1.setWidth(200);

        ImageView imageView2 = new ImageView();
        imageView2.setY(100);
        imageView2.setX(100);
        imageView2.setHeight(200);
        imageView2.setWidth(200);

        ImageView result = TestL9.arrangeImage(imageView1, imageView2);

        assertEquals(300, result.getX());
    }

    @Test
    public void arrangeImage2() {
        ImageView imageView1 = new ImageView();
        imageView1.setY(200);
        imageView1.setX(200);
        imageView1.setHeight(200);
        imageView1.setWidth(200);

        ImageView imageView2 = new ImageView();
        imageView2.setY(100);
        imageView2.setX(100);
        imageView2.setHeight(200);
        imageView2.setWidth(200);

        ImageView result = TestL9.arrangeImage(imageView1, imageView2);

        assertEquals(400, result.getX());
    }



    @Test
    public void arrangeImage3() {
        ImageView imageView1 = new ImageView(50, 50);
        imageView1.setHeight(200);
        imageView1.setWidth(200);

        ImageView imageView2 = new ImageView(10,10);
        imageView2.setY(100);
        imageView2.setX(100);
        imageView2.setHeight(200);
        imageView2.setWidth(200);

        ImageView result = TestL9.arrangeImage(imageView1, imageView2);

        assertEquals(250, result.getX());
    }

}