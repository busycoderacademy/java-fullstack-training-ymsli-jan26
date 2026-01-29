package com.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect //Aspect =advice + point cut
public class AudienceAspect {
	
	//@Before vs @After vs @AfterReturning @Arund annoation sec tx mgt
//	@Around("execution(public String doMagic())")
	//@Around("execution( * doMagic())") vs @Around("execution( * com.demo.doMagic())")
	@Around("execution( * com.demo.do*(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		long start= System.currentTimeMillis();
		
		Object result =joinPoint.proceed();
		
		long end= System.currentTimeMillis();
		System.out.println("time taken :"+ (end-start)+" ms and it applied to method with name: " + joinPoint.getSignature().getName());
		return result;
	}
//	@AfterThrowing(value = "execution(public String doMagic())", throwing = "ex")
//	public void exceptionHandler(MagicianHeartAttack ex){
//		System.out.println("------------------");
//	    System.out.println(ex.getMessage());
//	}
//	
//	@AfterReturning("execution(public String doMagic())")
//	public void clapping(){
//	    System.out.println("clapping...maza aa gaya");
//	}

}


//@Pointcut("execution(public String doMagic())")
//public void foo() {}
//
//@Before("foo()")
//public void clapping(){
//    System.out.println("clapping...maza aa gaya");
//}