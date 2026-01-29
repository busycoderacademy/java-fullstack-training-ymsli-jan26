package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
 public class Magician {

	public String doEat() {
		System.out.println("eating the food leav me along...");
		delay();
		return "rasgullla from luch box...";
	}

	
	public String doMagic() {
		System.out.println("abara ka dabra...");
		delay();
		return "rabbit from the Hat";
	}

	private void delay() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/*
 * public void f1(){ System.out.println("f1 method of magician"); } public void
 * f2(){ System.out.println("f2 method of magician"); } public void f3(){
 * System.out.println("f3 method of magician"); }
 */