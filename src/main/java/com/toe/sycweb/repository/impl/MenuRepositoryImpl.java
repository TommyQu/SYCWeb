package com.toe.sycweb.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.toe.sycweb.entity.Menu;
import com.toe.sycweb.repository.IMenuRepository;

@Repository
public class MenuRepositoryImpl implements IMenuRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public String newMenu(Menu menu) {
		try {
			mongoTemplate.insert(menu, "menu");
			return "success";
		} catch (Exception e) {
			return e.getMessage().toString();
		}
	}

	@Override
	public List<Menu> getAllMenus() {
		try {
			return mongoTemplate.findAll(Menu.class, "menu");
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
			return null;
		}
	}

}
