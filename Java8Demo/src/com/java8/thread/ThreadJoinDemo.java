package com.java8.thread;

class MyJoinThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child thread ----->>>>>>");
			try{
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

class MyJoinThread1 implements Runnable{
	
	
	public void run(){
		
		for(int i=0;i<3;i++)
		{
			System.out.println("second child---->>.");
		}
		
		
	}
}
public class ThreadJoinDemo {
	
	
	public static void main(String[] args) {
		Thread t=new Thread(new MyJoinThread1());
		MyJoinThread m=new MyJoinThread();
	
		
		m.start();
		t.start();
		
		try{
			m.join();
			t.join();
				
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("main Thread");
		}
	}

}
