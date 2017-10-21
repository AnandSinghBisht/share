package com.java8.concurrent;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo2 extends Thread {
	static ConcurrentHashMap<Integer,String> cmp=new ConcurrentHashMap<Integer,String>();
	
	public void run()
	{
		System.out.println("Child Thread");
		
		try{
			Thread.sleep(3000);
			cmp.put(104, "c");
			System.out.println("Update by Child Thread");
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		cmp.put(101, "A");
		cmp.put(102, "B");
		cmp.put(103, "D");
		
		ConcurrentHashMapDemo2 d=new ConcurrentHashMapDemo2();
		d.start();
		
		Set set=cmp.keySet();
		Iterator it=set.iterator();
		while(it.hasNext())
		{
			Integer i=(Integer)it.next();
			System.out.println("Key  "+i+"  value  "+ cmp.get(i));
			try{
				Thread.sleep(3000);
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}

}
