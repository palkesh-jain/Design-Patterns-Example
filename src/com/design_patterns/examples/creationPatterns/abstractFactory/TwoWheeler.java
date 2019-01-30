package com.design_patterns.examples.creationPatterns.abstractFactory;

public class TwoWheeler implements Vehicle {

    private String brand;

    public TwoWheeler(String brand) {
        this.brand = brand;
    }

    public String getVehicleType() {
        return "Two Wheeler";
    }

    public String getVehicleBrand() {
        return brand;
    }

}
