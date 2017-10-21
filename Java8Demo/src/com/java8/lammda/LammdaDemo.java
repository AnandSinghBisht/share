package com.java8.lammda;

public class LammdaDemo {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Before");
		MyLambdaExp	myExp=()-> System.out.println("check Lammda Expression");
		
		myExp.myExp();
		
		
		
	MyLambdaExp1 exp=(String name)->{
		return "Hello "+name;
	};
		
	System.out.println(exp.getName("Anand"));
	System.out.println("After");
	}

	
	
}

interface MyLambdaExp
{
	void myExp();
}

interface MyLambdaExp1
{
	String getName(String name);
}