package com.java8.concurrent;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(5);
		al.add(6);
		al.add(7);		
		CopyOnWriteArrayList<Integer> cowal=new CopyOnWriteArrayList<Integer>();
		
		cowal.add(5);
		cowal.add(5);
		cowal.add(5);
		cowal.addIfAbsent(5);
		
		cowal.addAllAbsent(al);
		System.out.println(cowal);
		
		
	}

}
