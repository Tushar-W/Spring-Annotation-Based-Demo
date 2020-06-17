package com.springdemo;

import com.springdemo.interfaces.IVehicle;
import org.springframework.stereotype.Component;

@Component
public class Car implements IVehicle {

    @Override
    public void drive() {
        System.out.println("Car is Running");
    }
}
