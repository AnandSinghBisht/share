package com.java8.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
	
	
	public static List<A> saveMap()
	{
		List<A> ls=new ArrayList<A>();
		A a=new A();
		a.setI(1);
		a.setName("hello");
		a.setPhone(44545);
		a.setAge(12);
		ls.add(a);
		
		A a1=new A();
		a1.setI(2);
		a1.setName("hello1");
		a1.setPhone(445453232);
		a1.setAge(1222);
		ls.add(a1);
		
		return ls;
		
	}
	
	public static void main(String...a){
		
		Map<String,List<A>> ma= new HashMap<String,List<A>>();
		System.out.println(saveMap());
		List<A> lst=null;
		for(A a2:saveMap())
		{
			if(a2.getAge()==12)
			{
				A a3=new A();
				a3.setI(a2.getI());
				a3.setName(a2.getName());
				a3.setAge(a2.getAge());
				a3.setPhone(a2.getPhone());
				lst=new ArrayList<A>();
				lst.add(a3);
				ma.put("1", lst);
			}
			if(a2.getAge()==1222)
			{
				A a3=new A();
				a3.setI(a2.getI());
				a3.setName(a2.getName());
				a3.setAge(a2.getAge());
				a3.setPhone(a2.getPhone());
				lst=new ArrayList<A>();
				lst.add(a3);
				ma.put("2", lst);
			}
		
		}
		
		System.out.println(ma);
		
		
		
	}

}
class A
{
	private int i;
	private String name;
	private int phone;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "A [i=" + i + ", name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}

	private int age;
}
