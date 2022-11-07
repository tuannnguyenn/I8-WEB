package com.i8web.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i8web.entity.Admin.Posts;
import com.i8web.model.Admin.PostsModel;
@Service
public class PostServiceImpl implements IPostService{
	@Autowired
	private PostsModel postModel;
	public List<Posts> GetDataPost(){
		return postModel.GetDataPost();
	}
	

}
