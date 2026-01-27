package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Passanger is a high level module
//Vehicle is a low level module
//OCP
//Passanger is reposible for obtaining vehicle => pull
/*
 * 
	<bean id="p" class="com.demo.Passanger" autowire="byType">
		<property name="name" value="raja"/>
	</bean>
 */
@Component(value = "p")
public class Passanger {
	
	@Value("raja")
    private String name;
    
    private Vehicle vehicle;
    
    @Autowired   
    public Passanger(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

    public void setName(String name) {
        this.name = name;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

  
	public void travel(){
        System.out.println("name :"+ name);
        vehicle.move();
    }

}
