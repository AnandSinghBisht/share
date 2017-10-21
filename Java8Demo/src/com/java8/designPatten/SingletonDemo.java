package com.java8.designPatten;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class SingletonDemo {
	
	public static SingletonDemo instance;
	
	
	private SingletonDemo()
	{
		
	}

	public static SingletonDemo getInstance()
	{
		if(instance==null)
		{
			synchronized (SingletonDemo.class) {
				if(instance==null){
					instance=new SingletonDemo();
				}
			}
		}
		return null;
	}
}
