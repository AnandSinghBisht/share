package com.howtodoinjava.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.howtodoinjava.app.bean.Employee;
import com.howtodoinjava.app.bean.Users;
import com.howtodoinjava.app.rep.UserRepo;
import com.howtodoinjava.app.rep.UsersRepositery;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	UsersRepositery repo;
	
	@Autowired
	UserRepo userRepo;
	
	@RequestMapping(value="/ajaxtest")
	public @ResponseBody String getAjaxData()
	{
		String str="jahiii";
		System.out.println("controller");
		return str;
	}
	
	@RequestMapping(value="/read/{id}")
	public void readData(@PathVariable int id, @RequestBody Users user)
	{
		System.out.println(id);
		
		Employee emp=(Employee)repo.findOne(1);
		System.out.println(emp);
		System.out.println("User :--"+ user);
	}
	
	@RequestMapping(value="/update")
	public void updateEmployee(@RequestBody Employee emp)
	{
		System.out.println(emp);
		Employee employee=repo.findOne(emp.getEmp_id());
		
		System.out.println(employee);
		repo.save(emp);
		System.out.println(emp);
	}
	
	@RequestMapping(value="/allEmployee")
	public void allEmployee()
	{
		System.out.println(repo.findAll());
	}
	
	@RequestMapping(value="/search/Prem")
	public void findEmpByName()
	{
		
	}
	@RequestMapping("/saveUser")
	public void saveUse(@RequestBody Users user)
	{
	
		userRepo.save(user);
	}
	
	@RequestMapping("/findUser/{name}")
	public void findUser(@PathVariable String name)
	{
		System.out.println("name"+name);
		System.out.println(userRepo.findByName(name));
	}
}
