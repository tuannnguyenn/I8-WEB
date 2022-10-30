package com.i8web.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.i8web.entity.Admin.Posts;
import com.i8web.entity.Admin.Products;
import com.i8web.model.Admin.PostsModel;
import com.i8web.model.Admin.ProductsModel;

@Service
@Transactional
public class AdminService {
	@Autowired
	 private PostsModel postsModel;
	private ProductsModel productsModel;
	 public List<Posts> getListPosts() {
		  return postsModel.GetListPosts();
	}
	 public List<Posts> GetPostById(int id){
		 return postsModel.GetPostById(id);
	 }
	 public void insertPost (Posts post) {
		 postsModel.InsertDataPost(post);
	 }
	 public void deletePost (int id) {
		 postsModel.DeleteDataPost(id);
	 }
	 public void updatePost (Posts post) {
		 postsModel.UpdateDataPost(post);
	 }
	 public List<Products> getListProducts() {
		    return productsModel.GetListProducts();
		}
		public List<Products> GetProductById(int id){
		   return productsModel.GetProductsById(id);
		}
		public void insertProduct (Products product) {
		   productsModel.InsertDataProducts(product);
		}
		public void deleteProduct (int id) {
		   productsModel.DeleteDataProducts(id);
		}
		public void updateProduct (Products product) {
		   productsModel.UpdateDataProducts(product);
		}
	 
}
