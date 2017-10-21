package com.java8.thread;

class MyThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++){
			
			System.out.println("child thread.....");
			
		}
		
	}
}

public class ThreadPriorityDemo {
	
	
	public static void main(String[] args) {
	
		Thread t=new Thread(new MyThread());

		t.setPriority(10);
		t.start();
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread--");
		}
		
	}
	
	
	

}
