package com.i8web.model.Admin;


import java.time.LocalDate;
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
	
	public List<Posts> GetListPosts() {
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * FROM posts";
		list = _jdbcTemplate.query(sql, new MapperPosts());
		return list;
	}
	public List<Posts> GetPostById(int id) {
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * FROM posts WHERE id = " + id;
		list = _jdbcTemplate.query(sql, new MapperPosts());
		return list;
	}
	public void InsertDataPost(Posts post) {
		String sql = "INSERT INTO posts(image,title,date,description,post_id,slug)" + "VALUES(?,?,?,?,?,?)";
		_jdbcTemplate.update(sql,post.getImage(),post.getTitle(),LocalDate.now().toString(),post.getDescription(),post.getPost_id(),post.getSlug());
	}
	public void DeleteDataPost(int id) {
		String sql = "DELETE FROM posts WHERE id = " + id;
		_jdbcTemplate.update(sql);
	}
	public void UpdateDataPost(Posts post, String description) {
		String sql = "UPDATE posts SET image = ?,title = ?, date = ?,description = ?, post_id = ?, slug = ? WHERE id = ?";
		_jdbcTemplate.update(sql,post.getImage(),post.getTitle(),LocalDate.now().toString(),description,post.getPost_id(),post.getSlug(),post.getId());

	}
	
}
