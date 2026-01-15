//package com.day4.session2_exhandling;
//
//import java.io.IOException;
//
//class AEx extends Exception {
//}
//
//class BEx extends AEx {
//}
//
//
//class A {
//	void foo() throws BEx {
//		System.out.println("foo of class A");
//	}
//}
//
//class B extends A {
//	// overriden method can not throw bigger checked ex,
//	// not throwing any ex from overriden method is also ok
//	@Override
//	void foo() throws AEx{
//		System.out.println("foo of class B");
//	}
//}
//
//public class E_Ex_Overriding {
//	public static void main(String[] args) {
//
//		A a = new B();
//		
//		try {
//			a.foo();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//}
