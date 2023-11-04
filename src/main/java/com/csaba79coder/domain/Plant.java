package com.csaba79coder.domain;

public class Plant extends LivingCreature implements PlantActivity {

    public Plant() {
    }

    public Plant(String name, int age, String[] colors) {
        super(name, age, colors);
    }
    @Override
    void feed() {
        System.out.println("Plant is being fed. Yum yum yum. Water water water.");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Plant is photosynthesizing. Sun sun sun.");
    }

    /*@Override
    String feed() {
        return "Plant is being fed. Yum yum yum. Water water water.";
    }*/
}
