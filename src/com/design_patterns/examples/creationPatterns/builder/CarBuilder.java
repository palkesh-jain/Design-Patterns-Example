package com.design_patterns.examples.creationPatterns.builder;

class CarBuilder {
    private String color;
    private int wheels;

    CarBuilder() {
        // Default values
        color = "White";
        wheels = 2;
    }

    Car build() {
        Car car = new Car();
        car.setColor(color);
        car.setWheels(wheels);
        return car;
    }

    CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    CarBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }
}