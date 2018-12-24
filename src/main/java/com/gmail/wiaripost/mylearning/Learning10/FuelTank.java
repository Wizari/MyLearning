package com.gmail.wiaripost.mylearning.Learning10;

public class FuelTank implements Filled {
    private final double MAX_VALUE = 40;
    private double currentValue = 0;


    @Override
    public void fill() {
        currentValue = MAX_VALUE;
    }

    @Override
    public double getFill() {
        return currentValue--;
    }
}
