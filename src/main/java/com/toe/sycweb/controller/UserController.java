package com.toe.sycweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.toe.sycweb.service.impl.UserService;

@Controller
@RequestMapping(value="user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="login.do")
	public @ResponseBody Boolean login(ModelMap modelMap) {
		userService.login("a", "a");
		return false;
	}
}
