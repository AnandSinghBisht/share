package com.java8.concurrent;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentDemo implements Runnable {
	static List<String> al=new ArrayList<String>();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			System.out.println("Enter Child Class");
			Thread.sleep(2000);
			al.add("D");
		}catch(InterruptedException e)
		{
		e.printStackTrace();
		}
	}

	public static void main(String[] args)throws InterruptedException {
		
		al.add("a");
		al.add("b");
		al.add("c");
		Thread t=new Thread(new ConcurrentDemo());
		t.start();
		System.out.println("Enter the main thread");
		
		for(String ls:al)
		{
			System.out.println(ls);
			Thread.sleep(3000);
		}
		
	}

	
}
