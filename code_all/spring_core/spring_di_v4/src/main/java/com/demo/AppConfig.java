package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan(basePackages = { "com.demo" })
 public class AppConfig {

	@Bean
	 Vehicle v1() {
		return new Car();
	}
	
	@Bean
	@Primary
	 Vehicle v2() {
		return new Bike();
	}
	
	@Bean(name = "p")
	 Passanger passanger(Vehicle vehicle) {
		Passanger passanger = new Passanger(vehicle);
		passanger.setName("Raja");
		return passanger;
	}
}
