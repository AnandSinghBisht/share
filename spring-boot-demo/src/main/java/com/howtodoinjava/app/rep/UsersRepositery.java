package com.howtodoinjava.app.rep;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.app.bean.Employee;

@Transactional
public interface UsersRepositery extends CrudRepository<Employee, Integer>{
	
}
