package com.design_patterns.examples.creationPatterns.singleton;

public class SingletonPatternTest {

    public static void main(String[] args) {

        // SingletonClass object = new SingletonClass();
        // Compile Time Error: The constructor SingletonClass() is not visible

        // Get the only object available
        Singleton object = Singleton.getInstance();

        // show the message
        object.sayHelloWorld();
    }

}
