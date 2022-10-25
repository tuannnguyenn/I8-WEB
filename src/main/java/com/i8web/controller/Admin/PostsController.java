package com.i8web.controller.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.AdminService;
import com.i8web.Service.Admin.PostServiceImpl;
import com.i8web.entity.Admin.Posts;
import com.i8web.model.Admin.PostsModel;

@Controller
public class PostsController {
	@Autowired
   AdminService adminService;
	@RequestMapping(value = "/admin/post/create", method = RequestMethod.GET)
	public ModelAndView create() {
		ModelAndView mav = new ModelAndView("/admin/post/create");
		mav.addObject("post", new Posts());
		return mav;
	}
   @RequestMapping(value = "/admin/post/create", method = RequestMethod.POST)
   public ModelAndView create(@ModelAttribute("post") Posts post) {
      ModelAndView mav = new ModelAndView("/admin/post/create");
      adminService.insertPost(post);
      return mav;
   }
   
   @RequestMapping(value = "/admin/post/list", method = RequestMethod.GET)
   public ModelAndView list() {
      ModelAndView mav = new ModelAndView("/admin/post/list");
      mav.addObject("posts", adminService.getDataPost());
      return mav;
   }
   
   @RequestMapping(value = "/admin/post/category/create", method = RequestMethod.GET)
   public ModelAndView createCat() {
      ModelAndView mav = new ModelAndView("/admin/post/category/create");
      return mav;
   }
   
   @RequestMapping(value = "/admin/post/category/list", method = RequestMethod.GET)
   public ModelAndView listCat() {
      ModelAndView mav = new ModelAndView("/admin/post/category/list");
      return mav;
   }
}