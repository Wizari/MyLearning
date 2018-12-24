package com.gmail.wiaripost.mylearning.Learning10;

public class Motorcycle extends Transport {

    public Motorcycle() {
        super.moveParts = new Actionable[2];
    }

    @Override
    public void refill() {
        super.refill();
        System.out.println("Мото заправлен");
    }

    @Override
    public void addMoveParts(Actionable... part) {
        super.addMoveParts(part);
    }

    @Override
    public void changeMovePart(int numberPart, Actionable part) {
        super.changeMovePart(numberPart, part);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Мотоцикл поехал");
    }
}

