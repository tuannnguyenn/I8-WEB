package com.i8web.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.i8web.entity.Admin.CategoriesProduct;
import com.i8web.entity.Admin.Products;
import com.i8web.model.Admin.CategoriesProductModel;
import com.i8web.model.Admin.ProductsAdminModel;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductsAdminModel productsModel;
	public List<Products> getListProducts() {
		return productsModel.GetListProducts();
	}

	public List<Products> GetProductById(int id) {
		return productsModel.GetProductById(id);
	}
	public void insertProduct(Products product) {
		
		productsModel.InsertDataProduct(product);
		
	}
	public void deleteProduct(int id) {
		productsModel.DeleteDataProduct(id);
	}

	public void updateProduct(Products product,String description,String detail) {
		productsModel.UpdateDataProduct(product,description,detail);
	}
	private CategoriesProductModel categoriesProductModel;
	public List<CategoriesProduct> getListCategoriesProduct() {
		return categoriesProductModel.GetListCategoriesProduct();
	}
}
