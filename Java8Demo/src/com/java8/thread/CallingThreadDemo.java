	package com.java8.thread;

class ThreadA implements Runnable
{
	public void run(){
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try{
			
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
class ThreadA1 implements Runnable{
	
	public void run()
	{
		
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try{
			
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
}
class ThreadB implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			Thread.yield();
		}
	}
}

public class CallingThreadDemo {
		public static void main(String[] args) {
	
			
			Thread t=new Thread(new ThreadA());
			Thread t1=new Thread(new ThreadB());
			
			t.start();
			t1.start();
			
			}
}
