package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
 public class Magician {

	public String doMagic() {
		System.out.println("abara ka dabra...");
		if(1==1)
			throw new MagicianHeartAttack("call dr now !");

		return "rabbit from the Hat";
	}
}

/*
 * public void f1(){ System.out.println("f1 method of magician"); } public void
 * f2(){ System.out.println("f2 method of magician"); } public void f3(){
 * System.out.println("f3 method of magician"); }
 */