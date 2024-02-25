package com.designpatterns.factorypattern;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createMotorVehicle() {
        return new Car();
    }
}
