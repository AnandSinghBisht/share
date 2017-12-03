package com.java8.inheritance;

interface A{
	public abstract int a();
	public abstract  int b();
}

interface B{
	public abstract int a();
	public abstract  int b();
}
public class InheritanceDemo implements A,B {

	@Override
	public int a() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void display()
	{
		System.out.println("Main");
	}
	@Override
	public int b() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		A a=new InheritanceDemo();
		B b=new InheritanceDemo();
	
		InheritanceDemo as=new InheritanceDemo();
		as.display();
	}

}
