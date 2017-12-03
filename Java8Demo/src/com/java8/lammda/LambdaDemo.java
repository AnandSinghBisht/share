package com.java8.lammda;
interface A{
	void foo();
}

interface B
{
	 int add(int a);
}
public class LambdaDemo {
	

	public static void main(String[] args) {
		A a=()->System.out.println("super");
		a.foo();
		B b=(int aa)->{ return aa;};
		System.out.println(b.add(5));
	}
}
