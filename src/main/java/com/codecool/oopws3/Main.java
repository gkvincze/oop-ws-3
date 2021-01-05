package com.codecool.oopws3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        Cat cat = new Cat ("Fluffy", false);
        Dog dog = new Dog ("Fang", true);
        animals.add(cat);
        animals.add(dog);
        Owner owner = new Owner(animals);
        owner.feed();
    }

}
