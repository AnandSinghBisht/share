package com.java8.loop;

import java.util.Arrays;
import java.util.List;

public class Looping {

	public Looping() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args) {
		
		List ls=Arrays.asList(1.2,4,5,7,8);		
		
		ls.forEach(System.out::println);
		
	}
}
