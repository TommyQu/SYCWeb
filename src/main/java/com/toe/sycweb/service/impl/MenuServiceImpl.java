package com.toe.sycweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toe.sycweb.entity.Menu;
import com.toe.sycweb.repository.IMenuRepository;

@Service
public class MenuServiceImpl implements IMenuRepository{

	@Autowired
	IMenuRepository menuRepository;
	
	@Override
	public String newMenu(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

}
