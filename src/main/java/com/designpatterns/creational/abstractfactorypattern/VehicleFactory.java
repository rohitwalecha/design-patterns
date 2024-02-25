package com.designpatterns.creational.abstractfactorypattern;

public abstract class VehicleFactory {
    public abstract FuelVehicle createFuelVehicle();
    public abstract ElectricVehicle createElectricVehicle();
}