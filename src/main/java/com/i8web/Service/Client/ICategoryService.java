package com.i8web.Service.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.i8web.entity.Client.Category;

public interface ICategoryService {
	@Autowired
	public List<Category> GetDataCategory();
	public List<Category> GetCategoryById(int id);
}
