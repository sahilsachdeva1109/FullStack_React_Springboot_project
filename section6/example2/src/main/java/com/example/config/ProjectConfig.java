package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "audi")
    Vehicle vehicle1(){
    Vehicle vehicle = new Vehicle();
    vehicle.setName("Audi");
    return vehicle;
    }
    @Bean(value = "honda")
    Vehicle vehicle2(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }
    @Bean("Ferrari")
    Vehicle vehicle3(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }

    @Bean
    String hello(){
        return "Return Hello World";
    }

    @Bean
    Integer number(){
        return 16;
    }

}
