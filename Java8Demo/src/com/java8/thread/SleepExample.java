package com.java8.thread;

public class SleepExample {
	
	
	public static void main(String[] args)throws InterruptedException {
		
		Thread t=new Thread(new Runnable()
				{

					@Override
					public void run() {
						
						System.out.println("First Task Start");
						System.out.println("2 second sleep");
						try{
						Thread.sleep(2000);
						}catch(InterruptedException e)
						{
							e.printStackTrace();
						}
						System.out.println("Finished First Task");
						
					}
			
				});
		
		Thread t1=new Thread(new Runnable(){
			
			
			public void run()
			{
				System.out.println("2 second Task complited");
			}
		});
			
		t.start();
		t1.start();
		t.join();
		
		
	}

}
