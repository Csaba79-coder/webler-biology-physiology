package com.csaba79coder;

import com.csaba79coder.domain.*;

public class BiologyApp {

    public static void main(String[] args) {

        Carnivore lion = new Carnivore("Lion", 5, new String[] {"Brown", "Gold", "White"}, "Male");
        System.out.println(lion);
        lion.move();

        Herbivore rabbit = new Herbivore("Rabbit", 2, new String[] {"White"}, "Female");
        System.out.println(rabbit);
        rabbit.move();

        Omnivore bear = new Omnivore("Bear", 3, new String[] {"Brown"}, "Male");
        System.out.println(bear);
        bear.move();

        int counter = LivingCreature.creatureCounter;
        System.out.println("Number of living creatures are: " + counter);

        Animal animal = new Animal();
        System.out.println(animal);
        animal.feed();
        animal.setGender("Female");
        System.out.println(animal);

        // extra to play!!!
        Animal animal1 = new Carnivore("..", 0, new String[] {".."}, "..");
        Carnivore carnivore = (Carnivore) new Animal("..", 0, new String[] {".."}, "..");
    }
}
