package com.i8web.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.i8web.entity.Admin.Posts;

public interface IPostService {
	@Autowired
	public List<Posts> GetDataPost();
}
