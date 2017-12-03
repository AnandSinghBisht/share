package com.java8.thread;

public class WorkingThread extends Thread{

	
	
	public static void display(String a)
	{
		System.out.println("value "+a);
	}
	public void run()
	{
		String name=Thread.currentThread().getName();
		display(name);
		Thread.currentThread().yield();
		synchronized (Thread.currentThread()) {
			Thread.currentThread().notify();	
		}
		
	}
	public static void main(String[] args) {
		WorkingThread wt=new WorkingThread();
		WorkingThread wt1=new WorkingThread();
		wt.start();
		wt1.start();
		try{
			WorkingThread.yield();
			display("Main");
		/*synchronized(WorkingThread.class)
		{
		//	c.class.yield();
			
		}*/
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
