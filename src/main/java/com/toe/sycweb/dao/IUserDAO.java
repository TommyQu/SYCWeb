package com.toe.sycweb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.toe.sycweb.model.User;

public interface IUserDAO extends MongoRepository<User, String>{
	public Boolean login(String email, String pwd);
}
