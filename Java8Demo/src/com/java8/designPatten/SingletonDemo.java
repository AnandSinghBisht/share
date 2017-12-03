package com.java8.designPatten;

public class SingletonDemo {
	
	private static SingletonDemo instance;
	private static int i=0;
	
	private SingletonDemo()
	{
		System.out.println(i);
	}
	public static SingletonDemo getInstance()
	{
		if(instance==null){
			synchronized(SingletonDemo.class){
				if(instance==null)
				{
					instance=new SingletonDemo();
					i++;
				}
			}
		}
		return instance;
	}
	
	public void display()
	{
		System.out.println("count "+i);
	}
	}
