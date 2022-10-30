package com.i8web.model.Admin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Admin.MapperProducts;
import com.i8web.entity.Admin.Products;

@Repository
public class ProductsModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<Products> GetListProducts() {
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM products";
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}

	public List<Products> GetProductsById(int id) {
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM products WHERE id = " + id;
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}

	public void InsertDataProducts(Products product) {
		String sql = "INSERT INTO products(name,price_old,price_new,description,status,many_image,image,detail,product_id,ghimSale,ghimNew,slug)"
				+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		_jdbcTemplate.update(sql, product.getName(), product.getPrice_old(), product.getPrice_new(),
				product.getDescription(), product.getStatus(), product.getMany_image(), product.getImage(),
				product.getDetail(), product.getProduct_id(), product.getGhimSale(), product.getGhimNew(),
				product.getSlug());
	}

	public void DeleteDataProducts(int id) {
		String sql = "DELETE FROM products WHERE id = " + id;
		_jdbcTemplate.update(sql);
	}

	public void UpdateDataProducts(Products product) {
		String sql = "UPDATE posts SET name=?,price_old=?,price_new=?,description=?,"
				+ "status=?,many_image=?,image=?,detail=?,product_id=?,ghimSale=?,ghimNew=?,slug=?  WHERE id = ?";
		_jdbcTemplate.update(sql, product.getName(), product.getPrice_old(), product.getPrice_new(),
				product.getDescription(), product.getStatus(), product.getMany_image(), product.getImage(),
				product.getDetail(), product.getProduct_id(), product.getGhimSale(), product.getGhimNew(),
				product.getSlug(), product.getId());

	}

}