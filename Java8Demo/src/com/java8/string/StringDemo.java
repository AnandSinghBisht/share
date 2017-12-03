package com.java8.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Animal implements Comparator<Animal>{
	
	
	public String name;
	public String type;
	
	Animal(String name,String type){
		this.name=name;
		this.type=type;
	}
	
	public static Comparator<Animal> sortbyType=new Comparator<Animal>() {
		
		public int compare(Animal am,Animal am1)
		{
			return am.type.compareTo(am1.type);
		}
	};
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int compare(Animal animal,Animal animal1)
	{
		return animal.name.compareTo(animal1.name);
	}
	
}

class Employee implements Comparator<Employee>
{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public int compare(Employee emp,Employee emp1)
	{
		
		return emp.name.compareTo(emp1.name);
	}
	
	Employee(String name,Integer age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	

	public static Comparator<Employee> sortByAge=new Comparator<Employee>() {
		
		@Override
		public int compare(Employee emp,Employee emp1)
		{
			return emp.age-emp1.age;	
		}
		
	};
}



public class StringDemo {
	
	public static void main(String[] args) {
		
		
		Employee em=new Employee("a",326);
		Employee em1=new Employee("b",261);
		Employee em2=new Employee("c",206);
		Employee em3=new Employee("d",126);
		
		
		Animal an=new Animal("A","Z");
		Animal an1=new Animal("Z","A");
		
		Animal an2=new Animal("R","T");
		Animal an3=new Animal("T","R");
		
		List<Animal> list1=new ArrayList<Animal>();
		list1.add(an1);
		list1.add(an);
		list1.add(an2);
		list1.add(an3);
		System.out.println(list1);
		
		Collections.sort(list1,an.sortbyType);
		
		System.out.println(list1);
		
		
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(em2);
		list.add(em3);
		list.add(em);
		list.add(em1);
		
		
		System.out.println("After  "+list);
		Collections.sort(list, em);
		System.out.println(list);
		
		Collections.sort(list,Employee.sortByAge);
		
		System.out.println(list);
		String s="Anand sing";
		
		String s1=new String("Anand sing");
		String s2=s1.intern();
		if(s==s2)
		{
			System.out.println("true"); 
		
		}
		else
		{
			System.out.println("false");
		}
		System.out.println(s.substring(0,2));
	}

}
