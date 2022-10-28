package com.i8web.Service.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
