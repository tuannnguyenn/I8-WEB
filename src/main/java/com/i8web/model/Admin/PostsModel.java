package com.i8web.model.Admin;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Admin.Posts;
import com.i8web.entity.Admin.MapperPosts;

@Repository
public class PostsModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<Posts> GetDataPost() {
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * FROM posts";
		list = _jdbcTemplate.query(sql, new MapperPosts());
		return list;
	}
}
