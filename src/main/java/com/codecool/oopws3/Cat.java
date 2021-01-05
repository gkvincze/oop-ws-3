package com.codecool.oopws3;

public class Cat extends Animal{

    public Cat(String name, boolean isMale) {
        super(name, isMale);
    }

    @Override
    public void speak() {
        System.out.println("Meow meow");
    }
}
