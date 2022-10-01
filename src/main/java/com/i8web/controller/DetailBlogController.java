package com.i8web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DetailBlogController {
	  @RequestMapping(value = "/chitiet-blog", method = RequestMethod.GET)
	   public ModelAndView DetailProductPage() {
	      ModelAndView mav = new ModelAndView("blog/detail_blog");
	      return mav;
	   }
}
