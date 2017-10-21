package com.java8.thread;

class MyInterrupt implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child thread ");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("Interrupted by other thread");
			}
			
		}
	}
}

class InterruptedThread extends Thread
{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Don ----->>>");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
public class InterruptDemo {
	
	public static void main(String[] args) {
		Thread t=new Thread(new MyInterrupt());
	
		InterruptedThread t1=new InterruptedThread();
		t.setPriority(10);
		t.start();
		t1.start();
		t1.interrupt();
		
		
		System.out.println("main");
		
		
			
		
	}

}
