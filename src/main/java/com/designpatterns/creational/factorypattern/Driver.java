package com.designpatterns.creational.factorypattern;

public class Driver {
    public static void main(String[] args) {
        VehicleFactory mcvf = new MotorCycleFactory();
        FuelVehicle motorCycle = mcvf.create();
        System.out.println(motorCycle);

        VehicleFactory cf = new CarFactory();
        FuelVehicle car = cf.create();
        System.out.println(car);
    }
}
