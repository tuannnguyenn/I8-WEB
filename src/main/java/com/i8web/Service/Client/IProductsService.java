package com.i8web.Service.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.i8web.entity.Client.Category;
import com.i8web.entity.Client.Products;

public interface IProductsService {
	@Autowired
	public List<Products> GetDataProducts();
	public List<Products> GetProductsByCatId(int id);
	public List<Products> GetProductsById(int id);
	public List<Products> GetDataProductsToPrice(int id, String price_new);
	public List<Products> GetDataProductsSort(int id, String sort);
	public List<Category> GetDataCategory();
	public List<Category> GetCategoryById(int id);
}
