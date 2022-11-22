package com.i8web.model.Client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Client.Category;
import com.i8web.entity.Client.MapperCategory;

@Repository
public class CategoryModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<Category> GetDataCategory() {
		List<Category> list = new ArrayList<Category>();
		String sql = "SELECT * FROM categories";
		list = _jdbcTemplate.query(sql, new MapperCategory());
		return list;
	}

	public List<Category> GetCategoryById(int id) {
		List<Category> list = new ArrayList<Category>();
		String sql = "SELECT * FROM categories WHERE id = "+id;
		list = _jdbcTemplate.query(sql, new MapperCategory());
		return list;
	}
}
