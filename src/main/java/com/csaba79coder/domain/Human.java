package com.csaba79coder.domain;

public class Human extends LivingCreature implements CommonActivity, HumanActivity {

    private String gender;

    public Human() {
    }

    public Human(String name, int age, String[] colors, String gender) {
        super(name, age, colors);
        this.gender = gender;
    }

    @Override
    void feed() {
        System.out.println("Human is being fed. Yum yum yum. Food food food.");
    }

    @Override
    public void move() {
        // Implement human-specific movement
    }

    @Override
    public void sleep() {
        // Implement human-specific sleeping
    }

    @Override
    public void speak() {

    }

    @Override
    public void think() {

    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
