package com.design_patterns.examples.structuralPatterns.bridge;

public abstract class Shape {

    Color color;

    Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
