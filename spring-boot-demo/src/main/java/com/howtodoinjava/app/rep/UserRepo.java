package com.howtodoinjava.app.rep;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.howtodoinjava.app.bean.Users;

@Transactional
public interface UserRepo extends CrudRepository<Users, Integer> {

	public Users findByName(String name);
}
