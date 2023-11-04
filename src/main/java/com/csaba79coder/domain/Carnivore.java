package com.csaba79coder.domain;

import java.util.Arrays;

// if needed can separate implement the 2 interfaces, but by default it is not needed (inherited from Animal)
// Húsevő
public class Carnivore extends Animal implements CommonActivity, AnimalActivity {

    public Carnivore() {
    }

    public Carnivore(String name, int age, String[] colors, String gender) {
        super(name, age, colors, gender);
    }

    @Override
    public void feed() {
        System.out.println("Eating meet!");
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", colors=" + Arrays.toString(this.getColors()) +
                ", gender='" + super.getGender() + '\'';
    }
}
