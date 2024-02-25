package com.designpatterns.factorypattern;

public class Driver {
    public static void main(String[] args) {
        VehicleFactory mcvf = new MotorCycleFactory();
        Vehicle motorCycle = mcvf.create();
        System.out.println(motorCycle);

        VehicleFactory cf = new CarFactory();
        Vehicle car = cf.create();
        System.out.println(car);
    }
}
