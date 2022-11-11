package com.i8web.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.i8web.entity.Admin.CategoriesPost;
import com.i8web.model.Admin.CategoriesPostModel;

@Service
@Transactional
public class CategoriesPostService {
	@Autowired
	private CategoriesPostModel categoriesPostModel;
	public List<CategoriesPost> getListCategoriesPost() {
		return categoriesPostModel.GetListCategoriesPost();
	}

	public List<CategoriesPost> GetCategoryPostById(int id) {
		return categoriesPostModel.GetCategoryPostById(id);
	}
	public void insertCategoryPost(CategoriesPost categoryPost) {
		
		 categoriesPostModel.InsertDataCategoryPost(categoryPost);
		
	}

	public void deleteCategoryPost(int id) {
		categoriesPostModel.DeleteDataCategoryPost(id);
	}

	public void updateCategoryPost(CategoriesPost categoryPost) {
		categoriesPostModel.UpdateDataCategoryPost(categoryPost);
	}
}
