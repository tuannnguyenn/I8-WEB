package com.i8web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductsController {
	
	@RequestMapping(value = "/danh-sach-san-pham", method = RequestMethod.GET)
	   public ModelAndView CategoryProductsPage() {
	      ModelAndView mav = new ModelAndView("product/category_product");
	      return mav;
	}
	@RequestMapping(value = "/chi-tiet-san-pham", method = RequestMethod.GET)
	   public ModelAndView DetailProductsPage() {
	      ModelAndView mav = new ModelAndView("product/detail_product");
	      return mav;
	}
	/*
	 * @RequestMapping(value = "/san-pham", method = RequestMethod.GET) public
	 * ModelAndView CategoryProductsPage() { ModelAndView mav = new
	 * ModelAndView("product/product"); return mav; }
	 */
}