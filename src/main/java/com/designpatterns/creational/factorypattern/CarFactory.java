package com.designpatterns.creational.factorypattern;

public class CarFactory extends VehicleFactory {
    @Override
    public FuelVehicle createFuelVehicle() {
        return new Car();
    }
}
