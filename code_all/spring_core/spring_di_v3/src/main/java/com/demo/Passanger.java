package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


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
