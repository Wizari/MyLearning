package com.gmail.wiaripost.mylearning.Learning10;

public class Learning10 {
    public static void main(String[] args) {
        Car car = new Car("Лада");
        Wheel wheel1 = new Wheel("Continental", 16);
        Wheel wheel2 = new Wheel("Continental", 16);
        Wheel wheel3 = new Wheel("Continental", 16);
        Wheel wheel4 = new Wheel("Continental", 16);

        car.addMoveParts(wheel1, wheel2, wheel3, wheel4);
        car.showBrand();
        car.changeMovePart(1, new Wheel("Какама", 1600));

        CaterpillarBBB caterpillar1 = new CaterpillarBBB();
        CaterpillarBBB caterpillar2 = new CaterpillarBBB();
        CaterpillarBBB caterpillar3 = new CaterpillarBBB();
        CaterpillarBBB caterpillar4 = new CaterpillarBBB();

//        car.changeMovePart(1, caterpillar1);
//        car.changeMovePart(2, caterpillar2);
//        car.changeMovePart(3, caterpillar3);
//        car.changeMovePart(4, caterpillar4);

        car.changeMovePart(0, caterpillar1);
        car.changeMovePart(1, caterpillar2);
        car.changeMovePart(2, caterpillar3);
        car.changeMovePart(3, caterpillar4);


        car.setStorage(new FuelTank());

        car.refill();
        car.drive();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.addMoveParts(wheel1, wheel2);
        motorcycle.setStorage(new FuelTank());
        motorcycle.refill();
        motorcycle.drive();

//        Сaterpillar();
//        Caterpillar
    }
}
