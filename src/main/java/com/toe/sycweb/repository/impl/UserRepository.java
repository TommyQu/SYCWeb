package com.toe.sycweb.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.toe.sycweb.entity.User;
import com.toe.sycweb.repository.IUserRepository;

@Repository
public class UserRepository implements IUserRepository{

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public Boolean login(String email, String pwd) {
		User user = new User();
		user.setId("1");
		user.setEmail("a@a.com");
		user.setPwd("123");
		user.setNickName("Tommy");
		user.setGender("male");
		mongoTemplate.save(user);
		System.out.println("bb");
		return null;
	}

}
