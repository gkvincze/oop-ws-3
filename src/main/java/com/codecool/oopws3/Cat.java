package com.codecool.oopws3;

public class Cat extends Animal{

    public Cat(String name, boolean isMale) {
        super(name, isMale);
    }

    @Override
    public void speak() {
        System.out.println("Meow meow");
    }

    @Override
    public void feed(Food food) throws FeedException{
        if (food==Food.BONE) {
            throw new FeedException(FeedExceptionCode.I_DONT_LIKE_BONE);
        } else {
            super.feed(food);
        }
    }
}
