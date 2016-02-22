package com.toe.sycweb.service;

import com.toe.sycweb.entity.User;

public interface IUserService {
	public User login(String email, String pwd);
	public String signUp(User user);
}
