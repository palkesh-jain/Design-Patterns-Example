package com.design_patterns.examples.structuralPatterns.bridge;

public class Triangle extends Shape {

    Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Filling triangle with color ");
        color.applyColor();
    }
}
