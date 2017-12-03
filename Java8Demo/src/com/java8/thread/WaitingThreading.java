package com.java8.thread;

import java.util.Arrays;
import java.util.List;

public class WaitingThreading extends Thread {
	
	
	private List<String> keys;
	private static List<Integer> value;
	
	public void run()
	{
		for(String s:keys)
		{
			try{
				Thread.sleep(1000);
				System.out.println(s);
				
				synchronized (Thread.currentThread()) {
					Thread.currentThread().notify();
				}
				
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		
		}
		
		
	}
	public WaitingThreading() {

	 keys=Arrays.asList("A","B","C","D","E");
	 value=Arrays.asList(1,2,3,4,5);
	}
	
	public static void main(String[] args) {
		
		
		WaitingThreading w=new WaitingThreading();
		
		w.start();
		try{
			synchronized (w) {
				
				w.wait();
				for(Integer i:value)
				{
					System.out.println(i);
					w.wait();	
					w.notify();
				}
			
			}
		
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
