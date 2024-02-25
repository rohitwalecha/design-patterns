package com.designpatterns.creational.abstractfactorypattern;

public class OlaFactory extends VehicleFactory{

    @Override
    public FuelVehicle createFuelVehicle() {
        return null;
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new OlaSOnePro();
    }
}
