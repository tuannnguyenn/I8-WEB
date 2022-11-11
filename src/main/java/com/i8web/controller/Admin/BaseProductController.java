package com.i8web.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.CategoriesPostService;
import com.i8web.Service.CategoriesProductService;
import com.i8web.entity.Admin.Posts;
import com.i8web.entity.Admin.Products;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class BaseProductController {
	@Autowired
	CategoriesProductService categoriesProductService;
	
	public ModelAndView _mav = new ModelAndView();
	@PostConstruct
	public ModelAndView Init() {
		_mav.addObject("categoriesProduct", categoriesProductService.getListCategoriesProduct());
		
		return _mav;
	}
	
}
