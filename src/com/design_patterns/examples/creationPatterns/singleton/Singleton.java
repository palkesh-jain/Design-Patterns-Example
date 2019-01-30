package com.design_patterns.examples.creationPatterns.singleton;

public class Singleton {

    // Create an object of SingletonClass
    private static Singleton instance = new Singleton();

    // Make the constructor private so that this class cannot be instantiated
    private Singleton() {
    }

    //Get the only object available
    public static Singleton getInstance() {
        return instance;
    }

    public void sayHelloWorld() {
        System.out.print("Hello World!");
    }

}
