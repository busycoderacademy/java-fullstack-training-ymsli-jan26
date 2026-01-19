package com.day4.session4b.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class MyKey {
	private int k;

	public int getK() {
		return k;
	}

	public MyKey(int k) {
		super();
		this.k = k;
	}

	@Override
	public String toString() {
		return "MyKey [k=" + k + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(k);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyKey other = (MyKey) obj;
		return k == other.k;
	}



}

public class D_Set {
	public static void main(String[] args) {


		// Set dont allow duplicate
		// HashSet, LinkedHashSet,TreeSet
		
//		Set set = new TreeSet();
//		set.add(2);
//		set.add("10");
//		System.out.println(set);

		
		Set<MyKey> set = new LinkedHashSet<>();
		set.add(new MyKey(22));
		set.add(new MyKey(202));
		
		System.out.println(set.contains(new MyKey(22)));
		
		
		
//		Set<String> set = new LinkedHashSet<>();
//		set.add("umesh");
//		set.add("foo");
//		set.add("bar");
//		set.add("foo");
//		set.add("apple");
		
//		Iterator<String> it=set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		for(String data: set) {
//			System.out.println(data);
//		}
	///System.out.println(set);
	
	}

	private static void putDataIntoSet(Set set, Object data) {
		
	}

}
