package com.i8web.model.Admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Admin.MapperOrders;
import com.i8web.entity.Admin.MapperProducts;
import com.i8web.entity.Admin.Order;
import com.i8web.entity.Admin.Products;
import com.i8web.entity.Client.Category;
import com.i8web.entity.Client.MapperCategory;

@Repository
public class OrderModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<Order> getData() {
		List<Order> list = new ArrayList<Order>();
		String sql = "SELECT * FROM orders";
		list = _jdbcTemplate.query(sql, new MapperOrders());
		return list;
	}

	public List<Order> GetOrderById(int id) {
		List<Order> list = new ArrayList<Order>();
		String sql = "SELECT * FROM orders WHERE id = " + id;
		list = _jdbcTemplate.query(sql, new MapperOrders());
		return list;
	}

	public List<Products> getProductByOrderID(int id) {
		List<Products> list = new ArrayList<Products>();
		String sql = "SELECT * FROM product_order  INNER JOIN products ON products.id  = product_order.id_product WHERE product_order.id_order = " + id;
		list = _jdbcTemplate.query(sql, new MapperProducts());
		System.out.println(list.size());
		return list;
	}
	
	public void DeleteDataOrder(int id) {
		String sql = "DELETE FROM orders WHERE id = " + id;
		_jdbcTemplate.update(sql);
	}
}