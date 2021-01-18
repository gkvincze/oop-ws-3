package com.codecool.oopws3;

import java.util.List;

public class Owner {

    List<Animal> animals;

    public Owner(List<Animal> animals) {
        this.animals = animals;
    }

    public void feed(Food food) throws FeedException {
        for (Animal animal : animals) {
            animal.feed(food);
        }
        //animals.forEach(Animal::feed);
    }
}
