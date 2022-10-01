package com.i8web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class CategoryProductController {
	@RequestMapping(value="/category-product", method = RequestMethod.GET)
	public ModelAndView checkoutpage() {
		ModelAndView mav = new ModelAndView ("product/category_product");
		return mav;
	}
}
