package com.java8.thread;

class MyThreadDemo implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++){
			System.out.println("child Thread with yield method");
			Thread.yield();
		}
	}
}

public class ThreadYieldDemo {
	
	public static void main(String[] args) {
		Thread t=new Thread(new MyThreadDemo());
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("main Thread");
		}
		
	}

}
