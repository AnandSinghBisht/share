package com.java8.thread;

public class WaitDemo {
	
	public static void main(String[] args) {
		
		
		
		try{
			
			System.out.println("Main Thread ");
		Thread.sleep(1000);
			System.out.println("Starting ");
			Thread.sleep(1000);
			System.out.println("Pause");
			Thread.sleep(1000);
			System.out.println("Ended");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}
