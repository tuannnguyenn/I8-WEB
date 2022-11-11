package com.i8web.controller.Admin;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.i8web.Service.CategoriesProductService;
import com.i8web.entity.Admin.CategoriesProduct;

@Controller
public class CategoriesProductController {
	@Autowired
	CategoriesProductService categoriesProductService;
	@RequestMapping(value = "/admin/product/category/create", method = RequestMethod.GET)
	public ModelAndView create() {
		ModelAndView mav = new ModelAndView("/admin/product/category/create");
		mav.addObject("categoryProduct", new CategoriesProduct());
		return mav;
	}
   @RequestMapping(value = "/admin/product/category/create", method = RequestMethod.POST)
   public ModelAndView create(@ModelAttribute("categoryProduct") CategoriesProduct categoryProduct) {
      ModelAndView mav = new ModelAndView("/admin/product/category/create");
      categoriesProductService.insertCategoryProduct(categoryProduct);
      return mav;
   }
   
   @RequestMapping(value = "/admin/product/category/list", method = RequestMethod.GET)
   public ModelAndView list() {
      ModelAndView mav = new ModelAndView("/admin/product/category/list");
      mav.addObject("categoriesProduct", categoriesProductService.getListCategoriesProduct());
      return mav;
   }
   
   @RequestMapping(value = "DeleteCategoryProduct/{id}")
   public String delete(@PathVariable int id,HttpServletRequest req) {
	   categoriesProductService.deleteCategoryProduct(id);
   return "redirect:/admin/product/category/list";
   } 
   @RequestMapping(value = "/EditCategoryProduct/{id}", method = RequestMethod.GET)
   public ModelAndView getEdit(@PathVariable int id,@ModelAttribute("categoryProduct") CategoriesProduct categoryProduct) {
	 
      ModelAndView mav = new ModelAndView("/admin/product/category/edit");
      mav.addObject("categoriesProduct", categoriesProductService.getListCategoriesProduct());
      mav.addObject("categoriesProductId", categoriesProductService.GetCategoryProductById(id));
      return mav;
   }
   @RequestMapping(value = "/EditCategoryProduct/{id}", method = RequestMethod.POST)
   public String postEdit(@PathVariable int id,@ModelAttribute("categoryProduct") CategoriesProduct categoryProduct,HttpServletRequest req) {
	  categoriesProductService.updateCategoryProduct(categoryProduct);
      return "redirect:/admin/product/category/list";
   }
}
