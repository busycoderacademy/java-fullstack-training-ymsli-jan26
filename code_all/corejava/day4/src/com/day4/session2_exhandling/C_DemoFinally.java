package com.day4.session2_exhandling;
//nver ever return values form finally block 2. never thorw ex from finally block
public class C_DemoFinally {
	
    public static void main(String[] args) {
    	try{
    		foo();
    	}catch(ArithmeticException ex) {
    		System.out.println(ex);
    	}
    	
    }
    public static void foo() {
    	try {
    		if(1==1) {
    			throw new NullPointerException("some npe");
    		}
    	}finally {
    		throw new ArithmeticException("some arthmatic ex");
    	}
    }
	
	
	
//    public static void main(String[] args) {
//    	int val=foo();
//    	System.out.println(val);
//    }
//    public static int foo() {
//    	try {
//    		return 10;
//    	}finally {
//    		return 20;
//    	}
//    }
}
