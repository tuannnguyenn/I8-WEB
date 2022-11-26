package com.i8web.controller.Admin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.Admin.CategoriesProductService;
@Controller
public class BaseReportController {
	@Autowired
	CategoriesProductService categoriesProductService;
	
	public ModelAndView _mav = new ModelAndView();
	@PostConstruct
	public ModelAndView Init() {
		_mav.addObject("categoriesProduct", categoriesProductService.getListCategoriesProduct());
		return _mav;
	}
}
