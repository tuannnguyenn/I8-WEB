package com.i8web.Service.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.i8web.entity.Client.CategoryPost;
import com.i8web.model.Client.CategoryPostModel;

public class CategoryPostServiceImpl {
	@Autowired
	private CategoryPostModel categoryPostModel;
	public List<CategoryPost> GetDataCategoryPost(){
		return categoryPostModel.GetDataCategoryPost();
	}
}
