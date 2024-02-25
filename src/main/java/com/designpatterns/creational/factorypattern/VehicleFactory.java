package com.designpatterns.creational.factorypattern;

public abstract class VehicleFactory {
    public FuelVehicle create(){
        FuelVehicle fuelVehicle = createFuelVehicle();
        fuelVehicle.build();
        return fuelVehicle;
    }

    protected abstract FuelVehicle createFuelVehicle();
}
