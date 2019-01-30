package com.design_patterns.examples.creationPatterns.abstractFactory;

public class HondaVehicleFactory {

    private static String brandName = "Honda";

    public static Vehicle newVehicle(int type) {
        switch (type) {
            case 1: {
                return new TwoWheeler(brandName);
            }
            case 2: {
                return new FourWheeler(brandName);
            }
        }
        return null;
    }
}