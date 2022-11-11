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
	
	public List<Products> GetBrandById(int id) {
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM products WHERE product_id ="+id;
		list = _jdbcTemplate.query(sql, new MapperProducts());
		return list;
	}
	
	
	public static final boolean isEmpty(String x) {
        return (x == null || x.trim().equals(""));
    }
	
	public List<Products> GetDataProductsFilter(int id, String price_new, String sort, String brand) {
		List<Products> list = new ArrayList<Products>();
//		System.out.println(price_new);
		if(!isEmpty(price_new)) {			
			if(price_new.equals("500000") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " AND price_new < " + price_new;
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
			if(price_new.equals("500000 AND 1000000") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " AND price_new BETWEEN " + price_new;
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
			if(price_new.equals("1000000 AND 5000000") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " AND price_new BETWEEN " + price_new;
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
			if(price_new.equals("5000000 AND 10000000") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " AND price_new BETWEEN " + price_new;
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
			if(price_new.equals("10000000") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " AND price_new > " + price_new;
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
		}
		
		if(!isEmpty(sort)) {			
			if(sort.equals("1") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " ORDER BY name ASC ";
				System.out.println(sql);
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
			if(sort.equals("2") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " ORDER BY name DESC ";
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
			if(sort.equals("3") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " ORDER BY price_new DESC ";
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
			if(sort.equals("4") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " ORDER BY price_new ASC ";
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
		}
		
		if(!isEmpty(brand)) {			
			if(brand.equals("Acer") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " AND brand = 'Acer'";
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
			if(brand.equals("Apple") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " AND brand = 'Apple'";
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
			if(brand.equals("Lenovo") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " AND brand = 'Lenovo'";
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
			if(brand.equals("Samsung") == true) {
				String sql = "SELECT * FROM products WHERE product_id = " + id + " AND brand = 'Samsung'";
				list = _jdbcTemplate.query(sql, new MapperProducts());
			}
		}
		
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
