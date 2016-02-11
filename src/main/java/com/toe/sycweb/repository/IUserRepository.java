package com.toe.sycweb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.toe.sycweb.model.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String>{
	public Boolean login(String email, String pwd);
}
