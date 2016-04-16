package com.toe.sycweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toe.sycweb.entity.Comment;
import com.toe.sycweb.entity.User;
import com.toe.sycweb.repository.IUserRepository;
import com.toe.sycweb.repository.impl.UserRepositoryImpl;
import com.toe.sycweb.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserRepository userRepository;
	
	@Override
	public User login(String email, String pwd) {
		return userRepository.login(email, pwd);
	}

	@Override
	public String signUp(User user) {
		return userRepository.signUp(user);
	}

}
