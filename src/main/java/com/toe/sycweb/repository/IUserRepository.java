package com.toe.sycweb.repository;

import com.toe.sycweb.entity.User;

public interface IUserRepository {
	public User login(String email, String pwd);
	public String signUp(User user);

}
