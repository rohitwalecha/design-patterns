package com.designpatterns.structural.factorypattern;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createMotorVehicle() {
        return new Car();
    }
}
