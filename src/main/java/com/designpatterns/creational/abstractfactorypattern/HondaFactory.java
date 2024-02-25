package com.designpatterns.creational.abstractfactorypattern;

public class HondaFactory extends VehicleFactory{
    @Override
    public FuelVehicle createFuelVehicle() {
        return new HondaActiva();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new HondaCivic();
    }


}
