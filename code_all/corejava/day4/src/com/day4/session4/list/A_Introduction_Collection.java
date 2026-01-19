package com.day4.session4.list;
import java.util.*;

public class A_Introduction_Collection {

	public static void main(String[] args) {
		// List, how to create list and display all elements

		List<String> list=new ArrayList<>();
		list.add("foo");
		list.add("bar");
		list.add("abc");
		list.add("jar");
		list.add("car");
		
		ListIterator<String> it=list.listIterator(list.size());
		while(it.hasPrevious()) {
		String val=it.previous();
		it.remove();
	}
//		list.forEach(n-> System.out.println(n));
//		
//		it.next();
//		it.remove();
//		it.remove();
//		System.out.println(list);
		
		
		
		//java 8 streams processing *
		
		
		//enhacne for loop
		
		//iterator dp
//		System.out.println(list);
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()) {
//			String val=it.next();
//			it.remove();
//		}
//		System.out.println(list);
		
		
		
		
		
		
		
		
		
		//System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		int index= Collections.binarySearch(list, "car");
//		System.out.println(index);
		
		//Using iterator

		//binary search

		//using ListIterator
	}
}
