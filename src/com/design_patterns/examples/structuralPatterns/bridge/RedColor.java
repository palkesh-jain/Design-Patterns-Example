package com.design_patterns.examples.structuralPatterns.bridge;

public class RedColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("red");
    }

}
