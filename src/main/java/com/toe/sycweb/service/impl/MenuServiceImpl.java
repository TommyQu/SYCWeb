package com.toe.sycweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toe.sycweb.entity.Menu;
import com.toe.sycweb.repository.IMenuRepository;
import com.toe.sycweb.service.IMenuService;

@Service
public class MenuServiceImpl implements IMenuService {

	@Autowired
	IMenuRepository menuRepository;
	
	@Override
	public String newMenu(Menu menu) {
		return menuRepository.newMenu(menu);
	}

	@Override
	public List<Menu> getAllMenus() {
		return menuRepository.getAllMenus();
	}

}
