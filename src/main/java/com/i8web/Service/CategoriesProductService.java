package com.i8web.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.i8web.entity.Admin.CategoriesProduct;
import com.i8web.model.Admin.CategoriesProductModel;

@Service
@Transactional
public class CategoriesProductService {
	@Autowired
	private CategoriesProductModel categoriesProductModel;
	public List<CategoriesProduct> getListCategoriesProduct() {
		return categoriesProductModel.GetListCategoriesProduct();
	}

	public List<CategoriesProduct> GetCategoryProductById(int id) {
		return categoriesProductModel.GetCategoryProductById(id);
	}
	public void insertCategoryProduct(CategoriesProduct categoryProduct) {
		
		 categoriesProductModel.InsertDataCategoryProduct(categoryProduct);
		
	}

	public void deleteCategoryProduct(int id) {
		categoriesProductModel.DeleteDataCategoryProduct(id);
	}

	public void updateCategoryProduct(CategoriesProduct categoryProduct) {
		categoriesProductModel.UpdateDataCategoryProduct(categoryProduct);
	}
}
