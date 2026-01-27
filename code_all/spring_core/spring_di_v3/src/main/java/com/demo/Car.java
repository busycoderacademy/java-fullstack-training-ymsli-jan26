package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "v1")
@Primary
public class Car implements Vehicle{
    public void move(){
        System.out.println("moving in a car ");
    }
}
