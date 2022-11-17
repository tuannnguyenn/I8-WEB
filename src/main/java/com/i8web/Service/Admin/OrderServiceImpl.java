package com.i8web.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.i8web.entity.Admin.Order;
import com.i8web.entity.Client.Products;
import com.i8web.model.Admin.OrderModel;

public class OrderServiceImpl {
	@Autowired
	private OrderModel orderModel;
	public List<Order> GetDataPost(){
		return orderModel.getData();
	}
	public List<Order> GetOrderById(int id) {
		return orderModel.GetOrderById(id);
	}
}
