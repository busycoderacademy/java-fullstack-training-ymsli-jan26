package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
  	
    	ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Passanger passanger=(Passanger) ctx.getBean("p");

    	passanger.travel();
    	
    
    	Passanger passanger2=(Passanger) ctx.getBean("p");
    	
    	System.out.println(AppConfig.class.getClass());
    	System.out.println(passanger.hashCode());
    	System.out.println(passanger2.hashCode());
    	
    
    }
}
