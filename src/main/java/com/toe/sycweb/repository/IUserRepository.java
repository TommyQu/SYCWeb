package com.toe.sycweb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.toe.sycweb.entity.User;

public interface IUserRepository {
	public User login(String email, String pwd);
}
