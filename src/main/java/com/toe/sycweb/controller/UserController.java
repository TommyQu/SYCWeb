package com.toe.sycweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.toe.sycweb.entity.User;
import com.toe.sycweb.service.IUserService;

@Controller
@RequestMapping(value="user")
public class UserController {

	@Autowired
	IUserService userService;
	
	@RequestMapping(value="login.do")
	public @ResponseBody String login(String email, String pwd, ModelMap modelMap) {
		User user = userService.login(email, pwd);
		if(user != null) {
			String userJSON = JSON.toJSONString(user);
			modelMap.addAttribute("userJSON", userJSON);
			return userJSON;
		}
		return "fail";
	}
	
	@RequestMapping(value="signUp.do")
	public @ResponseBody String signUp(String email, String nickname, String pwd, String gender, ModelMap modelMap) {
		User user = new User();
		user.setEmail(email);
		user.setNickname(nickname);
		user.setPwd(pwd);
		user.setGender(gender);
		return userService.signUp(user);
	}
}
