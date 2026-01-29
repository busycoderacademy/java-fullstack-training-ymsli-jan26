package com.demo;

import java.io.Serializable;
//how to ensure that even if it is not ....
class Collor{
	int size=90;
}
class Dog implements Serializable{
	String name;
	private transient Collor collor=new Collor();
	
}
//Singleton design pattern

//class Foo{
//	Foo(){
//		System.out.println("hello");
//	}
//}
//class Bar extends Foo{
//	
//	Bar(){
//		super();
//		System.out.println("hello");
//	}
//}
public class DemoSer {
	public static void main(String[] args) {
		
	}
}
