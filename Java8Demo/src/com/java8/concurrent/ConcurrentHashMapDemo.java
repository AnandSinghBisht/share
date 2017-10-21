package com.java8.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	
	public static void main(String[] args) {
		
		
		ConcurrentHashMap<Integer,String> cmp=new ConcurrentHashMap<Integer,String>();
		
		cmp.put(101, "A");
		cmp.put(102, "B");
		cmp.put(103, "C");
		cmp.put(104, "D");
		
		cmp.putIfAbsent(105, "A");
		
		cmp.remove(105, "S");
		
		
		
		
		System.out.println(cmp);
	}
}
