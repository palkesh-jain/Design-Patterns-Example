package com.design_patterns.examples.creationPatterns.abstractFactory;

public class AbstractFactoryPatternTest {

    public static void main(String[] args) {

        VehicleFactory vFactory = new VehicleFactory();
        // Honda TwoWheeler object
        Vehicle v1 = vFactory.newVehicle(1, "Honda");
        // Honda FourWheeler object
        Vehicle v2 = vFactory.newVehicle(2, "Honda");
        // Toyota FourWheeler object
        Vehicle v3 = vFactory.newVehicle(2, "Toyota");

        System.out.println("Type: " + v1.getVehicleType() + " Brand: " + v1.getVehicleBrand());
        System.out.println("Type: " + v2.getVehicleType() + " Brand: " + v2.getVehicleBrand());
        System.out.println("Type: " + v3.getVehicleType() + " Brand: " + v3.getVehicleBrand());
    }

}
