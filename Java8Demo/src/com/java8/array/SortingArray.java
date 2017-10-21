package com.java8.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SortingArray {
	
	public static void main(String[] args) {
		
		
		 String names[] = { "Peter", "Patricia", "Hunter", "Sarah",
				        "Gabe", "Gina", "Rob", "John", "Zoey", "Tammy", "Robert","Robert",
				        "Sean", "Paschal", "Kathy", "Neleh", "Vecepia","Paschal" };
		 
		 for(String name:names)
		 {
			 System.out.println(name);
		 }
		 
		 Arrays.sort(names);
		 
		 
		 Set<String> set=new HashSet<String>();
		
		System.out.println("After Sorting Arrays"); 
		 for(String name:names)
	 {
			 set.add(name);

	
	 }
		 
		 System.out.println( Collections.frequency(set, "Peter")); 
		 for(String s:set)
			 {
			 System.out.println(s);
		 }
	
	}
}
