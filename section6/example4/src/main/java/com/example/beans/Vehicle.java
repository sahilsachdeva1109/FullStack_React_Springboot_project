package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    public String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Printing hello from component ");
    }
    @PostConstruct
    public void initialize(){
        this.name= "Honda";
    }
}
