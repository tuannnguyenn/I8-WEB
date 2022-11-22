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
	public List<Products> GetBrandById(int id);
	public List<Products> GetDataProductsFilter(int id, String price_new, String sort, String brand);
	public List<Category> GetDataCategory();
	public List<Category> GetCategoryById(int id);
	public Products findProductById(int id);
}
