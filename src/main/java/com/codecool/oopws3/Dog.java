package com.codecool.oopws3;

public class Dog extends Animal{

    public Dog(String name, boolean isMale) {
        super(name, isMale);
    }

    @Override
    public void speak() {
        System.out.println("Wuff wuff");
    }

    @Override
    public void feed(Food food) throws FeedException{
        if (food==Food.MOUSE) {
            throw new FeedException(FeedExceptionCode.I_DONT_LIKE_MOUSE);
        } else {
            super.feed(food);
        }
    }
}
