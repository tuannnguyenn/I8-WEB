package com.i8web.model.Client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Client.MapperProducts;
import com.i8web.entity.Client.Products;

@Repository
public class ProductsModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<Products> GetProductsByCatId(int id) {
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM products WHERE product_id ="+id;
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}

	public List<Products> GetDataProducts() {
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM products";
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}
}
