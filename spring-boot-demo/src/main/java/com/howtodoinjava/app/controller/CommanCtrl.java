package com.howtodoinjava.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.app.bean.Employee;
import com.howtodoinjava.app.bean.Users;
import com.howtodoinjava.app.bean.UsersDetails;
import com.howtodoinjava.app.rep.UsersRepositery;

@Controller
public class CommanCtrl {

	@Autowired
	private UsersRepositery crud;
	
	@RequestMapping(value="/login")
	public ModelAndView login(@ModelAttribute Users user)
	{
		
		UsersDetails us=new UsersDetails();
		us.setId(1);
		us.setName("Anand");
		us.setPhoneNo(2312412);
		ModelAndView  mav=new ModelAndView("home");
		mav.addObject("user", us);
		return mav;
	}
	@RequestMapping(value="/getAllUsers")
	public String getAllUsers()
	{
		
	/*	Employee emp=new Employee();
		emp.setEmp_id(102);
		emp.setEmp_name("Prem");
		emp.setEmp_salary("10000000");
		
		System.out.println(crud.save(emp));*/
		System.out.println(crud.findAll());
		return "welcome";
	}
	
	@RequestMapping(value="/getAllEmployee")
	public ModelAndView getAllEmployee()
	{
		
	/*	Employee emp=new Employee();
		emp.setEmp_id(102);
		emp.setEmp_name("Prem");
		emp.setEmp_salary("10000000");
		
		System.out.println(crud.save(emp));*/
		ModelAndView mvc=new ModelAndView("view");
		mvc.addObject("employee",crud.findAll());
		System.out.println(crud.findAll());
		return mvc;
	}
	@RequestMapping(value="/getEmp/{id}")
	public ModelAndView getEmployee(@PathVariable Integer id)
	{
		ModelAndView m=new ModelAndView("updateEmp");
		m.addObject(crud.findOne(id));
		System.out.println();
		return m;

	}
	@RequestMapping(value="/updateEmp")
	public void getEmployee(@ModelAttribute Employee emp)
	{
		//ModelAndView m=new ModelAndView("updateEmp");
		
		System.out.println(emp);
		//m.addObject(crud.findOne(id));
		System.out.println();


	}
}
