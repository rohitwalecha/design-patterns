package com.designpatterns.creational.factorypattern;

public class MotorCycleFactory extends VehicleFactory {
    @Override
    public FuelVehicle createFuelVehicle() {
        return new MotorCycle();
    }
}
