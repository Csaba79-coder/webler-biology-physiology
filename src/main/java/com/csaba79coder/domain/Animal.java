package com.csaba79coder.domain;

public class Animal extends LivingCreature implements CommonActivity, AnimalActivity {

    private String gender;

    public Animal() {
    }

    public Animal(String name, int age, String[] colors, String gender) {
        super(name, age, colors);
        this.gender = gender;
    }

    @Override
    public void feed() {
        System.out.println("Animal is being fed. Yum yum yum. Animal food :) ");
    }

    @Override
    public void move() {
        // Implement animal-specific movement
        System.out.println("Animal can move!");
    }

    @Override
    public void sleep() {
        // Implement animal-specific sleeping
    }

    @Override
    public void makeSound() {

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
