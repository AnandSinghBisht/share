package com.java8.lammda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
	public String name;
	public Integer age;
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
	
	Employee(String name,Integer age)
	{
		this.name=name;
		this.age=age;
		
	}
}

public class LambdaComparator {
	public static void main(String[] args) {
		
		Employee em=new Employee("a",326);
		Employee em1=new Employee("b",261);
		Employee em2=new Employee("c",206);
		Employee em3=new Employee("d",126);
		
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(em1);
		emp.add(em);
		emp.add(em2);
		emp.add(em3);
		
		System.out.println(emp);
		Collections.sort(emp,(l,l1)->{
			return l.name.compareTo(l1.name);
		});
		System.out.println(emp);
		
		Collections.sort(emp,new Comparator<Employee>(){
			
			public int compare(Employee e,Employee e1)
			{
				return e.age-e1.age;
			}
		});
		System.out.println(emp);
	}
	

}
