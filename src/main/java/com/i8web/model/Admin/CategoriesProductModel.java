package com.i8web.model.Admin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Admin.CategoriesProduct;
import com.i8web.entity.Admin.MapperCategoriesProduct;
import com.i8web.entity.Admin.MapperPosts;
import com.i8web.entity.Admin.Posts;

@Repository
public class CategoriesProductModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<CategoriesProduct> GetListCategoriesProduct() {
		List<CategoriesProduct> list = new ArrayList<CategoriesProduct>();
		String sql = "SELECT * FROM categories";
		list = _jdbcTemplate.query(sql, new MapperCategoriesProduct());
		return list;
	}
	public List<CategoriesProduct> GetCategoryProductById(int id) {
		List<CategoriesProduct> list = new ArrayList<CategoriesProduct>();
		String sql = "SELECT * FROM categories WHERE id = " + id;
		list = _jdbcTemplate.query(sql, new MapperCategoriesProduct());
		return list;
	}
	public void InsertDataCategoryProduct(CategoriesProduct categoryProduct) {
		String sql = "INSERT INTO categories(name,slug,cat_id,created_at)" + "VALUES(?,?,?,?)";
		_jdbcTemplate.update(sql,categoryProduct.getName(),categoryProduct.getSlug(),categoryProduct.getCat_id(),LocalDate.now().toString());
	}
	public void DeleteDataCategoryProduct(int id) {
		String sql = "DELETE FROM categories WHERE id = " + id;
		_jdbcTemplate.update(sql);
	}
	public void UpdateDataCategoryProduct(CategoriesProduct categoryProduct) {
		String sql = "UPDATE categories SET name = ?,slug = ?, cat_id = ?, created_at = ? WHERE id = ?";
		_jdbcTemplate.update(sql,categoryProduct.getName(),categoryProduct.getSlug(),categoryProduct.getCat_id(),LocalDate.now().toString(),categoryProduct.getId());

	}
	
}
