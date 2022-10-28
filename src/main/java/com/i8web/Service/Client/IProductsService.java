package com.i8web.Service.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.i8web.entity.Client.Products;

public interface IProductsService {
	@Autowired
	public List<Products> GetDataProducts();
	public List<Products> GetProductsByCatId(int id);
}
