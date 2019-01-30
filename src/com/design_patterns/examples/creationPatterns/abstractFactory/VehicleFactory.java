package com.design_patterns.examples.creationPatterns.abstractFactory;

public class VehicleFactory {

    public Vehicle newVehicle(int vehicleType, String brand) {

        if (brand.equals("Honda")) {
            return HondaVehicleFactory.newVehicle(vehicleType);
        } else if (brand.equals("Toyota")){
            return ToyotaVehicleFactory.newVehicle(vehicleType);
        } else {
            return null;
        }

    }

}
