package com.toe.sycweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toe.sycweb.repository.impl.UserRepositoryImpl;
import com.toe.sycweb.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepositoryImpl userRepository;
	
	@Override
	public Boolean login(String email, String pwd) {
		return userRepository.login(email, pwd);
	}

}
