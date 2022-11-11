package com.i8web.controller.Admin;
import javax.servlet.http.HttpServletRequest;
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
public class PostsController extends BasePostController {
	@Autowired
   PostService postService;
	@RequestMapping(value = "/admin/post/create", method = RequestMethod.GET)
	public ModelAndView create() {
		_mav.addObject("post", new Posts());
		_mav.setViewName("admin/post/create");
		return _mav;
	}
   @RequestMapping(value = "/admin/post/create", method = RequestMethod.POST)
   public ModelAndView create(@ModelAttribute("post") Posts post) {
      ModelAndView mav = new ModelAndView("/admin/post/create");
      postService.insertPost(post);
      return mav;
   }
   
   @RequestMapping(value = "/admin/post/list", method = RequestMethod.GET)
   public ModelAndView list() {
      ModelAndView mav = new ModelAndView("/admin/post/list");
      mav.addObject("posts", postService.getListPosts());
      return mav;
   }
   
   @RequestMapping(value = "DeletePost/{id}")
   public String delete(@PathVariable int id,HttpServletRequest req) {
   postService.deletePost(id);
   return "redirect:/admin/post/list";
   } 
   @RequestMapping(value = "/EditPost/{id}", method = RequestMethod.GET)
   public ModelAndView getEdit(@PathVariable int id,@ModelAttribute("post") Posts post) {
	 
	  _mav.addObject("categoriesPost", categoriesPostService.getListCategoriesPost());
      _mav.addObject("posts", postService.getListPosts());
      _mav.addObject("PostId", postService.GetPostById(id));
      _mav.setViewName("admin/post/edit");
      return _mav;
   }
   @RequestMapping(value = "/EditPost/{id}", method = RequestMethod.POST)
   public String postEdit(@PathVariable int id,@ModelAttribute("post") Posts post,HttpServletRequest req) {
	  String description = req.getParameter("desc");
	  postService.updatePost(post,description);
      return "redirect:/admin/post/list";
   }
  
}