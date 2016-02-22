package com.toe.sycweb.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.toe.sycweb.entity.User;
import com.toe.sycweb.repository.IUserRepository;

@Repository
public class UserRepositoryImpl implements IUserRepository{

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public User login(String email, String pwd) {
		try {
			Query query = new Query();
			query.addCriteria(Criteria.where("email").is(email).and("pwd").is(pwd));
			User user = mongoTemplate.findOne(query, User.class);
			if(user != null) {
				return user;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String signUp(User user) {
		try {
			Query query = new Query();
			query.addCriteria(Criteria.where("email").is(user.getEmail()));
			Boolean isUserExists = mongoTemplate.exists(query, User.class);
			if(isUserExists == true)
				return "exist";
			else {
				mongoTemplate.insert(user, "user");
				return "success";
			}	
		} catch (Exception e) {
			return e.getMessage().toString();
		}
	}

}
