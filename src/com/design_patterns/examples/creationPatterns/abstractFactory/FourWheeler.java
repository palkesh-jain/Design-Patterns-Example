package com.design_patterns.examples.creationPatterns.abstractFactory;

public class FourWheeler implements Vehicle {

    private String brand;

    public FourWheeler(String brand) {
        this.brand = brand;
    }

    public String getVehicleType() {
        return "Four Wheeler";
    }

    public String getVehicleBrand() {
        return brand;
    }
}
