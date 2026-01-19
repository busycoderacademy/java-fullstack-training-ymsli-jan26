package com.mcq;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//class Cat {
//	static String foo = "value";
//}
//
//class CostlyCat extends Cat {
//	static String foo = "value2";
//}

class A {
	void method(int i) {
		System.out.println("base");
	}
}

class B extends A {

	void method(Integer i) {
		System.out.println("child");
	}
}

public class Q6 {

	public static void main(String[] args) {
		Random r=new Random(100);
		Set<Integer> s = new HashSet<>();
		for(int i=0;i<100;i++)
			s.add(r.nextInt());
		System.out.println(s.size());
		
		
//		A a = new B();
//		a.method(22);
		
//		System.out.println(new CostlyCat().foo);

//		Long l = new Long(0);
//		System.out.println(l.equals(0L));

//		BigDecimal bigDecimal=new BigDecimal("45.88");
//		bigDecimal.subtract(bigDecimal);

//		double d = 1.1 - 1.00;
//		System.out.println(d);
//		if (d == 0.10)
//			System.out.println("hello");
//		else
//			System.out.println("hi");
	}
}
