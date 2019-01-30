package com.design_patterns.examples.structuralPatterns.bridge;

public class Square extends Shape {

    Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Filling square with color ");
        color.applyColor();
    }
}
