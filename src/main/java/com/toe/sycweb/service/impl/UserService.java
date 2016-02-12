package com.toe.sycweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toe.sycweb.repository.impl.UserRepository;
import com.toe.sycweb.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Boolean login(String email, String pwd) {
		return userRepository.login(email, pwd);
	}

}
