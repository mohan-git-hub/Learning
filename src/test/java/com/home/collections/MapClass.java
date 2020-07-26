package com.home.collections;

import java.util.HashMap;
import java.util.TreeMap;

public class MapClass {
	//Map is declared in the form of Key and Value Pair 
	//
	
	public TreeMap ProcessMap() {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1, "One");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(2, "Two");
		//System.out.println(map);
		return map;
		
	}
	public static void main(String ar[]) {
		MapClass mc = new MapClass();
		TreeMap<Integer,String> ResultMap = mc.ProcessMap();
		System.out.println(ResultMap);
		System.out.println(ResultMap.get(3));
		System.out.println(ResultMap.keySet());
		System.out.println(ResultMap.values());
		
	}	

}

