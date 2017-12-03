package com.java8.designPatten;

public class TestingSingletonDemo {
	
	public static void main(String ...a){
	
	SingletonDemo i=SingletonDemo.getInstance();
	SingletonDemo i1=SingletonDemo.getInstance();
	SingletonDemo i2=SingletonDemo.getInstance();
	
	i.display();
	i1.display();
	i2.display();
	}

}
