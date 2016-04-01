package com.toe.sycweb.repository;

import java.util.List;

import com.toe.sycweb.entity.Menu;

public interface IMenuRepository {
	public String newMenu(Menu menu);
	public List<Menu> getAllMenus();
}
