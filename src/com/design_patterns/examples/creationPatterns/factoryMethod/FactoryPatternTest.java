package com.design_patterns.examples.creationPatterns.factoryMethod;

public class FactoryPatternTest {

    public static void main(String[] args) {

        VehicleFactory vFactory = new VehicleFactory();
        // TwoWheeler object
        Vehicle v1 = vFactory.newVehicle(1);
        // ThreeWheeler object
        Vehicle v2 = vFactory.newVehicle(2);
        // FourWheeler object
        Vehicle v3 = vFactory.newVehicle(3);

        System.out.println(v1.getVehicleType());
        System.out.println(v2.getVehicleType());
        System.out.println(v3.getVehicleType());
    }

}
