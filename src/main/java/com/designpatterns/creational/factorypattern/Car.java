package com.designpatterns.creational.factorypattern;

public class Car implements FuelVehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }

    @Override //jhgjhvjhvjhvjvj
    public String toString(){
        return "I am "+this.getClass();
    }
}