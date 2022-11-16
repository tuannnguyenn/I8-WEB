package com.i8web.controller.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.Admin.CategoriesPostService;
import com.i8web.entity.Admin.CategoriesPost;

@Controller
public class CategoriesPostController {
	@Autowired
	CategoriesPostService categoriesPostService;

	@RequestMapping(value = "/admin/post/category/create", method = RequestMethod.GET)
	public ModelAndView create(HttpSession session) {
		if (session.getAttribute("adminAccount") == null) {
			ModelAndView mav = new ModelAndView("admin/register/login");
			mav.addObject("isError", false);
			return mav;
		}
		ModelAndView mav = new ModelAndView("/admin/post/category/create");
		mav.addObject("categoryPost", new CategoriesPost());
		return mav;
	}

	@RequestMapping(value = "/admin/post/category/create", method = RequestMethod.POST)
	public ModelAndView create(@ModelAttribute("categoryPost") CategoriesPost categoryPost, HttpSession session) {
		if (session.getAttribute("adminAccount") == null) {
			ModelAndView mav = new ModelAndView("admin/register/login");
			mav.addObject("isError", false);
			return mav;
		}
		ModelAndView mav = new ModelAndView("/admin/post/category/create");
		categoriesPostService.insertCategoryPost(categoryPost);
		return mav;
	}

	@RequestMapping(value = "/admin/post/category/list", method = RequestMethod.GET)
	public ModelAndView list(HttpSession session) {
		if (session.getAttribute("adminAccount") == null) {
			ModelAndView mav = new ModelAndView("admin/register/login");
			mav.addObject("isError", false);
			return mav;
		}
		ModelAndView mav = new ModelAndView("/admin/post/category/list");
		mav.addObject("categoriesPost", categoriesPostService.getListCategoriesPost());
		return mav;
	}

	@RequestMapping(value = "DeleteCategoryPost/{id}")
	public String delete(@PathVariable int id, HttpServletRequest req) {
		categoriesPostService.deleteCategoryPost(id);
		return "redirect:/admin/post/category/list";
	}

	@RequestMapping(value = "/EditCategoryPost/{id}", method = RequestMethod.GET)
	public ModelAndView getEdit(@PathVariable int id, @ModelAttribute("categoryPost") CategoriesPost categoryPost,
			HttpSession session) {
		if (session.getAttribute("adminAccount") == null) {
			ModelAndView mav = new ModelAndView("admin/register/login");
			mav.addObject("isError", false);
			return mav;
		}
		ModelAndView mav = new ModelAndView("/admin/Post/category/edit");
		mav.addObject("categoriesPost", categoriesPostService.getListCategoriesPost());
		mav.addObject("categoriesPostId", categoriesPostService.GetCategoryPostById(id));
		return mav;
	}

	@RequestMapping(value = "/EditCategoryPost/{id}", method = RequestMethod.POST)
	public String postEdit(@PathVariable int id, @ModelAttribute("categoryPost") CategoriesPost categoryPost,
			HttpServletRequest req) {
		categoriesPostService.updateCategoryPost(categoryPost);
		return "redirect:/admin/post/category/list";
	}
}
