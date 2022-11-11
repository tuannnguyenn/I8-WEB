package com.i8web.model.Admin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.i8web.entity.Admin.CategoriesPost;
import com.i8web.entity.Admin.MapperCategoriesPost;


@Repository
public class CategoriesPostModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<CategoriesPost> GetListCategoriesPost() {
		List<CategoriesPost> list = new ArrayList<CategoriesPost>();
		String sql = "SELECT * FROM categoriespost";
		list = _jdbcTemplate.query(sql, new MapperCategoriesPost());
		return list;
	}
	public List<CategoriesPost> GetCategoryPostById(int id) {
		List<CategoriesPost> list = new ArrayList<CategoriesPost>();
		String sql = "SELECT * FROM categoriespost WHERE id = " + id;
		list = _jdbcTemplate.query(sql, new MapperCategoriesPost());
		return list;
	}
	public void InsertDataCategoryPost(CategoriesPost categoryPost) {
		String sql = "INSERT INTO categoriespost(name,slug,created_at)" + "VALUES(?,?,?)";
		_jdbcTemplate.update(sql,categoryPost.getName(),categoryPost.getSlug(),LocalDate.now().toString());
	}
	public void DeleteDataCategoryPost(int id) {
		String sql = "DELETE FROM categoriespost WHERE id = " + id;
		_jdbcTemplate.update(sql);
	}
	public void UpdateDataCategoryPost(CategoriesPost categoryPost) {
		String sql = "UPDATE categoriespost SET name = ?,slug = ?, created_at = ? WHERE id = ?";
		_jdbcTemplate.update(sql,categoryPost.getName(),categoryPost.getSlug(),LocalDate.now().toString(),categoryPost.getId());

	}
	
}

