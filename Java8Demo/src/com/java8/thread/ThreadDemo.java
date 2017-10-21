package com.java8.thread;


class A extends Thread
{
	public void run()
	{
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread"+Thread.currentThread().getName());
			Thread.yield();
		}
	
	}
	
	
}


class B extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Runnable "+Thread.currentThread().getName());
			Thread.yield();
		}
		
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		Thread pro=new A();
		Thread con=new B();
		
		pro.setPriority(Thread.MIN_PRIORITY);
		con.setPriority(Thread.MIN_PRIORITY);
		
		
		pro.start();
		con.start();
		
		
	}
}
