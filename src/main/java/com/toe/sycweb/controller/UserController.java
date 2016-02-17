package com.toe.sycweb.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.toe.sycweb.entity.User;
import com.toe.sycweb.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value="user")
public class UserController {

	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping(value="login.do")
	public @ResponseBody User login(String email, String pwd, HttpServletResponse response, ModelMap modelMap) {
		User user = userService.login(email, pwd);
		String userJSON = JSON.toJSONString(user);
		if(user != null) {
			Cookie cookie = new Cookie("user", userJSON);
			response.addCookie(cookie);
		}
		return user;
	}
	
	@RequestMapping(value="signUp.do")
	public @ResponseBody Boolean signUp(String email, String pwd, ModelMap modelMap) {
		userService.login(email, pwd);
		return false;
	}
}
