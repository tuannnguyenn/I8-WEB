package com.i8web.Service.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i8web.entity.Client.Category;
import com.i8web.model.Client.CategoryModel;

@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	private CategoryModel categoryModel;
	public List<Category> GetDataCategory(){
		return categoryModel.GetDataCategory();
	}
	public List<Category> GetCategoryById(int id){
		return categoryModel.GetCategoryById(id);
	}
}
