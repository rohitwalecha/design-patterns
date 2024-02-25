package com.designpatterns.factorypattern;

public class MotorCycle implements Vehicle {
    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }

    @Override
    public String toString(){
        return "I am MotorCycle";
    }
}
