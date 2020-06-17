package com.springdemo;

import com.springdemo.interfaces.IVehicle;

public class Bike implements IVehicle {
    @Override
    public void drive() {
        System.out.println("Bike is Running");
    }
}
