package com.designpatterns.creational.abstractfactorypattern;

public class OlaSOnePro implements ElectricVehicle{
    public OlaSOnePro(){
        System.out.println(this.getClass() + " Instantiated.");
    }
    @Override
    public void build() {
        System.out.println("Build OlaSOnePro.");
    }

    @Override
    public String toString(){
        return "I am "+this.getClass();
    }
}
