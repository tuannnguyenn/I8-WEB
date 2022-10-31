package com.i8web.controller.Admin;




import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.PostService;
import com.i8web.entity.Admin.Posts;

@Controller
public class PostsController {
	@Autowired
   PostService adminService;
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
      mav.addObject("posts", adminService.getListPosts());
      return mav;
   }
   
   @RequestMapping(value = "DeletePost/{id}")
   public String delete(@PathVariable int id,HttpServletRequest req) {
   adminService.deletePost(id);
   return "redirect:/admin/post/list";
   } 
   @RequestMapping(value = "/EditPost/{id}", method = RequestMethod.GET)
   public ModelAndView getEdit(@PathVariable int id,@ModelAttribute("post") Posts post) {
	 
      ModelAndView mav = new ModelAndView("/admin/post/edit");
      mav.addObject("posts", adminService.getListPosts());
      mav.addObject("PostId", adminService.GetPostById(id));
      return mav;
   }
   @RequestMapping(value = "/EditPost/{id}", method = RequestMethod.POST)
   public String postEdit(@PathVariable int id,@ModelAttribute("post") Posts post,HttpServletRequest req) {
	  adminService.updatePost(post);
      return "redirect:/admin/post/list";
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