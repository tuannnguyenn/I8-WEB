package com.i8web.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductAdminController {
	@RequestMapping(value = "/admin/product/create", method = RequestMethod.GET)
	   public ModelAndView create() {
	      ModelAndView mav = new ModelAndView("/admin/product/create");
	      return mav;
	   }
	   
	   @RequestMapping(value = "/admin/product/list", method = RequestMethod.GET)
	   public ModelAndView list() {
	      ModelAndView mav = new ModelAndView("/admin/product/list");
	      return mav;
	   }
	   @RequestMapping(value = "/admin/product/category/list", method = RequestMethod.GET)
	   public ModelAndView listCat() {
	      ModelAndView mav = new ModelAndView("/admin/product/category/list");
	      return mav;
	   }
}
