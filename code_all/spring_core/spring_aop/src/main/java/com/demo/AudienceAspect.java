package com.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect //Aspect =advice + point cut
public class AudienceAspect {
	
	//@Before vs @After vs @AfterReturning
	
	@AfterThrowing(value = "execution(public String doMagic())", throwing = "ex")
	public void exceptionHandler(MagicianHeartAttack ex){
		System.out.println("------------------");
	    System.out.println(ex.getMessage());
	}
	
	@AfterReturning("execution(public String doMagic())")
	public void clapping(){
	    System.out.println("clapping...maza aa gaya");
	}

}


//@Pointcut("execution(public String doMagic())")
//public void foo() {}
//
//@Before("foo()")
//public void clapping(){
//    System.out.println("clapping...maza aa gaya");
//}