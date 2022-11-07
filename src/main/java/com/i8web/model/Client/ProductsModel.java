package com.i8web.model.Client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Client.Category;
import com.i8web.entity.Client.MapperCategory;
import com.i8web.entity.Client.MapperProducts;
import com.i8web.entity.Client.Products;

@Repository
public class ProductsModel {
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
	
	public List<Products> GetProductsByCatId(int id) {
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM products WHERE product_id ="+id;
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}
	
	public List<Products> GetProductsById(int id) {
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM products WHERE id ="+id;
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}

	public List<Products> GetDataProducts() {
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM products";
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}
	

	public Products findProductById(int id) {
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM products";
		list = _jdbcTemplate.query(sql, new MapperProducts());
		for(Products pro:list) {
			if(pro.getId()==id)
			{
				return pro;
			}
		}
		return null;
	}

}
