package com.design_patterns.examples.creationPatterns.abstractFactory;

public class ToyotaVehicleFactory {

    private static String brandName = "Toyota";

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