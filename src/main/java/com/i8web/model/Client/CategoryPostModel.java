package com.i8web.model.Client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.i8web.entity.Client.CategoryPost;
import com.i8web.entity.Client.MapperCategoryPost;

public class CategoryPostModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<CategoryPost> GetDataCategoryPost() {
		List<CategoryPost> list = new ArrayList<CategoryPost>();
		String sql = "SELECT * FROM categoriesPost";
		list = _jdbcTemplate.query(sql, new MapperCategoryPost());
		return list;
	}
}
