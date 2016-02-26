package com.toe.sycweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.toe.sycweb.entity.User;
import com.toe.sycweb.service.IMenuService;

@Controller
@RequestMapping(value="menu")
public class MenuController {
//	
//	@Autowired
//	IMenuService menuService;
	
	@RequestMapping(value="newMenu.do")
	public @ResponseBody String newMenu(ModelMap modelMap) {
		
		return null;
	}
	
}
