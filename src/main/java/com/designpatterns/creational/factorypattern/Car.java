package com.designpatterns.creational.factorypattern;

public class Car implements FuelVehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }

    @Override
    public String toString(){
        return "I am "+this.getClass();
    }
}