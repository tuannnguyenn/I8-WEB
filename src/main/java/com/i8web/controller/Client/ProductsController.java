package com.i8web.controller.Client;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.Client.CategoryServiceImpl;
import com.i8web.Service.Client.ProductsServiceImpl;


@Controller
public class ProductsController {
	@Autowired
//	ProductsServiceImpl productsServiceImpl;
	CategoryServiceImpl categoryServiceImpl;
	@RequestMapping(value = "/{slug}", method = RequestMethod.GET)
	public ModelAndView CategoryProductsPage(HttpServletRequest req) {
		  //Lấy id		
		  String id = req.getParameter("id");
		  // Đẩy dữ liệu qua view		  
	      ModelAndView mav = new ModelAndView("product/category_product");
	      mav.addObject("listCat", categoryServiceImpl.GetDataCategory());
//	      mav.addObject("listProduct", productsServiceImpl.GetDataProducts());
	      mav.addObject("CatId", categoryServiceImpl.GetCategoryById(Integer.parseInt(id)));
	      return mav;
	}
	@RequestMapping(value = "/chi-tiet-san-pham", method = RequestMethod.GET)
	   public ModelAndView DetailProductsPage() {
	      ModelAndView mav = new ModelAndView("product/detail_product");
	      mav.addObject("listCat", categoryServiceImpl.GetDataCategory());
	      return mav;
	}
}