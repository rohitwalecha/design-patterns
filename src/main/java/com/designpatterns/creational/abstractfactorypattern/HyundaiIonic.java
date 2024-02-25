package com.designpatterns.creational.abstractfactorypattern;

public class HyundaiIonic implements ElectricVehicle{
    public HyundaiIonic(){
        System.out.println(this.getClass() + " Instantiated.");
    }

    @Override
    public void build() {
        System.out.println("Build HyundaiIonic.");
    }

    @Override
    public String toString(){
        return "I am "+this.getClass();
    }
}
