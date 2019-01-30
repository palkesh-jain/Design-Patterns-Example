package com.design_patterns.examples.creationPatterns.objectPool;

public class ObjectPoolTest {

    public static void main(String[] args) {
        Person person = ObjectPool.getObject();
        person.name = "John";
        System.out.println(person.name);

        ObjectPool.releaseObject(person);

        person = ObjectPool.getObject();
        person.name = "Paul";
        System.out.println(person.name);

        ObjectPool.releaseObject(person);

        person = ObjectPool.getObject();
        person.name = "Louis";
        System.out.println(person.name);

        ObjectPool.releaseObject(person);
    }

}
