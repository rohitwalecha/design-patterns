package com.designpatterns.creational.abstractfactorypattern;

public class HondaCivic implements ElectricVehicle{
    public HondaCivic(){
        System.out.println(this.getClass() + " Instantiated.");
    }

    @Override
    public void build() {
        System.out.println("Build HondaCivic.");
    }

    @Override
    public String toString(){
        return "I am "+this.getClass();
    }
}
