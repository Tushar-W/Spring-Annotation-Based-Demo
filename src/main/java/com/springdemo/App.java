package com.springdemo;

import com.springdemo.interfaces.IVehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        IVehicle vehicle = (IVehicle) context.getBean("car");
        vehicle.drive();
    }
}
