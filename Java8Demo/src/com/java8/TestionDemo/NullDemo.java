package com.java8.TestionDemo;


class A{
	public void display()
	{
		System.out.println("");
	}
}
public class NullDemo {
	
	public static void display(Object obj)
	{
		System.out.println("object");
	}
	public static void display(String obj)
	{
		System.out.println("string");
	}
	public static void main(String[] args) {
		
		display(null);
		
	}

}
