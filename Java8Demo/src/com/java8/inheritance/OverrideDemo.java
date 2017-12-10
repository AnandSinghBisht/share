package com.java8.inheritance;


class Foo
{
	int i=0;
	public int  j=0;
	private int k=0;
	protected int z=0;
	final int v=0;
	public void m1()
	{
		System.out.println("A");
	}
	
	private void m1(int i)
	{
		System.out.println("Private A");
	}
}


public class OverrideDemo  {
	
	private void m1(int i)
	{
		System.out.println("private override");
	}
	
	public static void main(String[] args) {
		
		Foo a= new Foo();
		
	}

}
