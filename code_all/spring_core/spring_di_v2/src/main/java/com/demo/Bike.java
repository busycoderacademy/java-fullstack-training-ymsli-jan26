package com.demo;

import org.springframework.stereotype.Component;

//	<bean id="v2" class="com.demo.Bike" primary="true" autowire-candidate="default"/>
@Component(value = "v2")
public class Bike implements Vehicle {
 
    public void move(){
        System.out.println("moving on a bike: ");
    }
}
