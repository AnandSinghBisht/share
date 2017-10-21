package com.java8.java7;

public class StringReplacement {

	
	public static void main(String[] args) {
		
		String str="This is text This is it.";
		
		if(str.contains("This") ){
			str=str.replaceAll("This", "Miss");
		}
		if( str.contains("is")){
			str=str.replaceAll("is", "iss");
		}
		System.out.println(str);
		
	}
}
