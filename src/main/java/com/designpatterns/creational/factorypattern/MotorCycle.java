package com.designpatterns.creational.factorypattern;

public class MotorCycle implements FuelVehicle {
    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }

    @Override
    public String toString(){
        return "I am "+this.getClass();
    }
}
