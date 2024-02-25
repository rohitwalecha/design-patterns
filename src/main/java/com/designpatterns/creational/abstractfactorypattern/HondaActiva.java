package com.designpatterns.creational.abstractfactorypattern;

public class HondaActiva implements FuelVehicle{
    public HondaActiva(){
        System.out.println(this.getClass() + " Instantiated.");
    }

    @Override
    public void build() {
        System.out.println("Build HondaActiva.");
    }

    @Override
    public String toString(){
        return "I am "+this.getClass();
    }
}
