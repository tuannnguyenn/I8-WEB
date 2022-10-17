package com.i8web.controller.Client;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
	 @RequestMapping(value = "/blog", method = RequestMethod.GET)
	   public ModelAndView BlogPage() {
	      ModelAndView mav = new ModelAndView("blog/blog");
	      return mav;
	 }
	 @RequestMapping(value = "/chi-tiet-blog", method = RequestMethod.GET)
	   public ModelAndView DetailBlogPage() {
	      ModelAndView mav = new ModelAndView("blog/detail_blog");
	      return mav;
	 }
}
