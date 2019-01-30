package com.design_patterns.examples.creationPatterns.builder;

public class Car {

    private int wheels;
    private String color;

    public String getColor() {
        return color;
    }

    void setColor(final String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    void setWheels(final int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Wheels: " + wheels + " " + "Color: " + color;
    }

}
