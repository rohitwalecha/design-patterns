package com.designpatterns.creational.abstractfactorypattern;

public class Driver {
    public static void main(String[] args) {
        VehicleFactory vf = new HondaFactory();
        ElectricVehicle ev = vf.createElectricVehicle(); // Honda's EV is Honda Civic
        FuelVehicle fv = vf.createFuelVehicle(); // Honda's Fuel Vehicle is Honda Activa
        System.out.println(ev);
        System.out.println(fv);

        vf = new OlaFactory();
        ev = vf.createElectricVehicle(); // Ola's EV is Ola S1 Pro
        System.out.println(ev);

        vf = new HyundaiFactory();
        fv = vf.createFuelVehicle(); //Hyundai's Fuel Vehicle is Creta
        System.out.println(fv);

    }
}
