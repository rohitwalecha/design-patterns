package com.designpatterns.structural.factorypattern;

public abstract class VehicleFactory {
    public Vehicle create(){
        Vehicle vehicle = createMotorVehicle();
        vehicle.build();
        return vehicle;
    }

    protected abstract Vehicle createMotorVehicle();
}
