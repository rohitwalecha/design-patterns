package com.designpatterns.structural.factorypattern;

public class Car implements Vehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }

    @Override
    public String toString(){
        return "I am Car";
    }
}