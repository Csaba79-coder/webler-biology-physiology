package com.csaba79coder.domain;

import java.util.Arrays;

// Növényevő
public class Herbivore extends Animal {

    public Herbivore() {
    }

    public Herbivore(String name, int age, String[] colors, String gender) {
        super(name, age, colors, gender);
    }

    @Override
    public void feed() {
        System.out.println("Eating plants!");
    }

    @Override
    public void move() {
        System.out.println("Rabbit can jump!");
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", colors=" + Arrays.toString(this.getColors()) +
                ", gender='" + super.getGender() + '\'';
    }
}
