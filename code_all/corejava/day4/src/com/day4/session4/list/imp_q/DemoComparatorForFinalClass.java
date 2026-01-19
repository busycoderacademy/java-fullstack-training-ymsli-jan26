package com.day4.session4.list.imp_q;

import java.util.Arrays;
import java.util.Comparator;

class StringSorterAsPerLength implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());//c strcmp
	}
}
public class DemoComparatorForFinalClass {
	
	public static void main(String[] args) {
		
		
//		String names[]= {"abc","jcdlkjfdlkj","ff"};
//		Arrays.sort(names, new StringSorterAsPerLength());
		
	}

}
