package com.i8web.Service.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i8web.entity.Client.Category;
import com.i8web.entity.Client.Products;
import com.i8web.model.Client.ProductsModel;

@Service
public class ProductsServiceImpl implements IProductsService {
	@Autowired
	private ProductsModel productsModel;
	public List<Products> GetDataProducts(){
		return productsModel.GetDataProducts();
	}
	public List<Products> GetProductsByCatId(int id) {
		return productsModel.GetProductsByCatId(id);
	}
	public List<Products> GetProductsById(int id) {
		return productsModel.GetProductsById(id);
	}
	public List<Products> GetBrandById(int id) {
		return productsModel.GetBrandById(id);
	}
	public List<Products> GetDataProductsFilter(int id, String price_new, String sort, String brand) {
		return productsModel.GetDataProductsFilter(id, price_new, sort, brand);
	}
	public List<Category> GetDataCategory(){
		return productsModel.GetDataCategory();
	}
	public List<Category> GetCategoryById(int id){
		return productsModel.GetCategoryById(id);
	}
	public Products findProductById(int id) {
		return productsModel.findProductById(id);
	}
}
