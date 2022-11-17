package com.i8web.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.i8web.entity.Admin.Order;

public interface IOrderService {
	@Autowired
	public List<Order> getData();
	public List<Order> GetOrderById(int id);
}
