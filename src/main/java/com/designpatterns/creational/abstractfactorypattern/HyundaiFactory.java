package com.designpatterns.creational.abstractfactorypattern;

public class HyundaiFactory extends VehicleFactory{

    @Override
    public FuelVehicle createFuelVehicle() {
        return new HyundaiCreta();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new HyundaiIonic();
    }
}
