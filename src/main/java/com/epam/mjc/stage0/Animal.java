package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal() {

    }
    public String getDescription() {
        String pawStr;
        String furStr;
        if(this.numberOfPaws > 1) {
            pawStr = "paws";
        } else {
            pawStr = "paw";
        }
        if(hasFur) {
            furStr = "";
        } else {
            furStr = " no";
        }
        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " " + pawStr + " and" + furStr + " fur.";
    }
}
