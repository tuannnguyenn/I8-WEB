package com.i8web.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.i8web.entity.Admin.Posts;
import com.i8web.model.Admin.PostsModel;

@Service
@Transactional
public class AdminService {
	@Autowired
	 private PostsModel postsModel;
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

}
