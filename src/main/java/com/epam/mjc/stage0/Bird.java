package com.epam.mjc.stage0;

public class Bird extends Animal{
    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        Animal animal = new Animal();
        return animal.getDescription() + " Moreover, it has " + "2 wings and can fly.";
    }

    public static void main(String[] args) {
        Animal bird = new Bird();
        System.out.println(bird.getDescription());
    }
}
