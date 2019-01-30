package com.design_patterns.examples.creationPatterns.factoryMethod;

public class VehicleFactory {

    public Vehicle newVehicle(int type) {
        switch (type) {
            case 1: {
                return new TwoWheeler();
            }
            case 2: {
                return new ThreeWheeler();
            }
            case 3: {
                return new FourWheeler();
            }
        }
        return null;
    }

}
