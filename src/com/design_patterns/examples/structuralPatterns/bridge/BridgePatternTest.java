package com.design_patterns.examples.structuralPatterns.bridge;

public class BridgePatternTest {

    public static void main(String[] args) {
        Color blue = new BlueColor();
        Color red = new RedColor();

        Shape redTriangle = new Triangle(red);
        Shape blueTriangle = new Triangle(blue);

        Shape redSquare = new Square(red);
        Shape blueSquare = new Square(blue);

        redTriangle.applyColor();
        blueTriangle.applyColor();
        redSquare.applyColor();
        blueSquare.applyColor();
    }

}
