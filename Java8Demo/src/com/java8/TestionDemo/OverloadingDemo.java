package com.java8.TestionDemo;

public class OverloadingDemo {
	
	
	public static void display(int i)
	{
		
	}
	public void display()
	{
		
	}
	public static void main(String[] args) {
		
		
		int j=1;
		int result;
		
		while(j<10)
		{
			result=j%2;
			if(result==0){
				System.out.println("Number is "+j);	
			}
			
			j++;
		}
		
		
		
	}

}
