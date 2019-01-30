package com.design_patterns.examples.creationPatterns.builder;

public class BuilderPatternTest {

    public static void main(final String[] arguments) {
        final CarBuilder builder = new CarBuilder();

        System.out.println(new CarBuilder().setColor("Red").setWheels(2).build());
        System.out.println(new CarBuilder().setColor("White").setWheels(4).build());
        System.out.println(new CarBuilder().setColor("Violet").build());
        System.out.println(new CarBuilder().build());
    }
}

