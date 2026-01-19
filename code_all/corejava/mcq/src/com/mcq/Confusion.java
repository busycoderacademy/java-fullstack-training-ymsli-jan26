//package com.mcq;
//
//class Foo{
//	private int i;
//
//	public Foo(int i) {
//		this.i = i;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Foo other = (Foo) obj;
//		if (i != other.i)
//			return false;
//		return true;
//	}
//
//}
//
//public class Confusion {
//
//	public static void main(String[] args) {
//		Object f1 = new Foo(22);
//		Object f2 = new Foo(22);
//		System.out.println(f1.equals(f2));
//	}
//
//}
//
////public class Confusion {
////	public Confusion(String o){
////		System.out.println("public Confusion(Object o)");
////	}
////	public Confusion(double[] o){
////		System.out.println("public Confusion( double[] o)");
////	}	
////	public static void main(String[] args) {
////		//new Confusion(null);
////		System.out.println('H' + 'i');
////	}	
////}