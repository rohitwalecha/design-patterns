package com.designpatterns.factorypattern;

public class MotorCycleFactory extends VehicleFactory {
    @Override
    public Vehicle createMotorVehicle() {
        return new MotorCycle();
    }
}
