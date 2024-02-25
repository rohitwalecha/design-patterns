package com.designpatterns.creational.abstractfactorypattern;

public class HyundaiCreta implements FuelVehicle{
    public HyundaiCreta(){
        System.out.println(this.getClass() + " Instantiated.");
    }

    @Override
    public void build() {
        System.out.println("Build HyundaiCreta");
    }

    @Override
    public String toString(){
        return "I am "+this.getClass();
    }
}
