package com.day4.session2_exhandling.doubts;

class A {
	void foo() {
		System.out.println("foo of a");
	}
}

class B extends A {
	void foo() {
		System.out.println("foo of b");
	}
}

class C extends A {
	void foo() {
		System.out.println("foo of c");
	}
}
//class Animal{
//	void eat() {
//		System.out.println("eat");
//	}
//}
//class Cat extends Animal{
//	void eat() {
//		System.out.println("eat in its home its cat");
//	}
//}
//class Dog extends Animal{
//	void eat() {
//		System.out.println("eat in its home its dog");
//	}
//	void nightWatChmanShip() {
//		System.out.println("jagato raho");
//	}
//}
//
//class CosltyDog extends Dog{
//	void eat() {
//		System.out.println("eat in its big house its dog");
//	}
//	void nightWatChmanShip() {
//		System.out.println("sleeping zzz cheep dog is saving ");
//	}
//}

public class DemoCCEx {
	public static void main(String[] args) {
//		
		A a = new C();
		C c=(C) new A();
		c.foo();
		
		
//
//		if (a instanceof B) {
//			B b = (B) a;
//
//			b.foo();
//			System.out.println("yes");
//		}else {
//			System.out.println("not");
//		}
		
		
//		Animal[]animals= {new Cat(), new Cat(), new Dog(), new CosltyDog()};
//		
//		for(Animal animal: animals) {
//			animal.eat();
//			if(animal instanceof Dog)
//			((Dog) animal).nightWatChmanShip();
//		}
		
		
		


	}
}
