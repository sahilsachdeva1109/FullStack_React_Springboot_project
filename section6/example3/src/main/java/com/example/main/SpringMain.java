package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {

    public static void main(String[] args) {
        // automatically detects the datatype
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle =  context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());


    }
}
