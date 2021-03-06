package com.toe.sycweb.service;

import java.util.List;

import com.toe.sycweb.entity.Comment;
import com.toe.sycweb.entity.Menu;

public interface IMenuService {
	public String newMenu(Menu menu);
	public List<Menu> getAllMenus();
	public Menu getSingleMenu(String id);
	public String newComment(Comment comment, String menuId);
}
