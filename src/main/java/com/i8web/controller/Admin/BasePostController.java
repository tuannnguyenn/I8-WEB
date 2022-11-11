package com.i8web.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.CategoriesPostService;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class BasePostController {
	@Autowired
	CategoriesPostService categoriesPostService;
	
	public ModelAndView _mav = new ModelAndView();
	@PostConstruct
	public ModelAndView Init() {
		 _mav.addObject("categoriesPost", categoriesPostService.getListCategoriesPost());
		
		return _mav;
	}
	
}