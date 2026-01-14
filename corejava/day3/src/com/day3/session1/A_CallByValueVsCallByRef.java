package com.day3.session1;

import java.util.Date;

class Val {
	int data;

	public Val(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}

public class A_CallByValueVsCallByRef {

	public static void change(Val a) {
		a = new Val(55);
	}

//	public static void change(Val a) {
//		a.setData(a.getData()*5);
//	}

//	public static void swap(Val a, Val b) {
//		Val temp;
//		temp = a;
//		a = b;
//		b = temp;
//	}

	public static void main(String[] args) {
		Date date = new Date();

		Val a = new Val(1);
		System.out.println(a.getData());
		change(a);
		System.out.println(a.getData());

		// Val b = new Val(2);

//		System.out.println("before a: " + a.getData() + " b: " + b.getData());
//		swap(a, b);
//		System.out.println("after a: " + a.getData() + " b: " + b.getData());

	}

}
