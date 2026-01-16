package com.day4.session5.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class F_Map_Basics {

	public static void main(String[] args) {
		//map, hashtable, map, 
		Map<String, Integer> map = new HashMap<>();
		map.put("ekta", 80);
		map.put("raj", 84);
		map.put("keshav", 90);
		map.put("keshav", 99);

		//map.keySet() vs map.entryset?
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ": "+ entry.getValue());
		}
		//java 8
		//map.entrySet().for
		
		
//		Set<String> keySet = map.keySet();
//		for(String key: keySet) {
//			System.out.println(key + ": "+ map.get(key));
//		}
		
//		System.out.println(map);

		// how to print the map
	}
}
