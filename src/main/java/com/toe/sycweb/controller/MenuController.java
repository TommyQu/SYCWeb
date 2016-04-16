package com.toe.sycweb.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.toe.sycweb.entity.Menu;
import com.toe.sycweb.entity.User;
import com.toe.sycweb.service.IMenuService;
import com.toe.sycweb.utils.SYCCloudinary;

@Controller
@RequestMapping(value="menu")
public class MenuController {
	
	@Autowired
	IMenuService menuService;
	
	@RequestMapping(value="newMenu.do")
	public @ResponseBody String newMenu(String title, String content, String userCookie, ModelMap modelMap) {
		Cloudinary cloudinary = SYCCloudinary.init();
		try {
			Map uploadResult = cloudinary.uploader().upload("http://pngimg.com/upload/book_PNG2111.png", ObjectUtils.asMap("resource_type", "auto"));;
			Menu menu = new Menu();
			menu.setTitle(title);
			menu.setContent(content);
			menu.setDisplayImgUrl("http://pngimg.com/upload/book_PNG2111.png");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date createdAt = new Date();
			menu.setCreatedAt(dateFormat.format(createdAt));
			User user = JSON.parseObject(userCookie, User.class);
			menu.setCreatedBy(user);
			menuService.newMenu(menu);
			return "success";
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			return "fail";
		}
	}
	
	@RequestMapping(value="getAllMenus.do")
	public @ResponseBody String getAllMenus() {
		String allMenusJSON = JSON.toJSONString(menuService.getAllMenus());
		return allMenusJSON;
	}
	
	@RequestMapping(value="getSingleMenu.do")
	public @ResponseBody String getSingleMenu(String id) {
		String singleMenuJSON = JSON.toJSONString(menuService.getSingleMenu(id));
		return singleMenuJSON;
	}
	
	@RequestMapping(value="newComment.do")
	public @ResponseBody String newComment(String userCookie, String menuId) {
		return null;
	}
}
