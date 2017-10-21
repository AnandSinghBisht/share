package com.java8.java7;

import java.util.Hashtable;
import java.util.Map;

public class IterateValueHashMap {
	
	public void getNonrepeatedCharater(String arg)
	{
		Map<Character, Integer> nonrep=new Hashtable<Character,Integer>();
		
		for(int i=0;i<arg.length();i++)
		{
			Character c=arg.charAt(i);
			if(nonrep.containsKey(c)){
				nonrep.put(c, nonrep.get(c)+1);
			}else{
				nonrep.put(c, 1);
			}
			
		}
		System.out.println(nonrep);
		
		for(Map.Entry<Character, Integer> entry:nonrep.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
		
			}
			
			System.out.println("end");
		}
		
		
				
	}
	
	public static void main(String[] args) {
	
	
		new IterateValueHashMap().getNonrepeatedCharater("Anand");
		
		
		
		
	}

}
