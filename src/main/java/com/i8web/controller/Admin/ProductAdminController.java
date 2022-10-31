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
import com.i8web.Service.ProductService;
import com.i8web.entity.Admin.Posts;
import com.i8web.entity.Admin.Products;

@Controller
public class ProductAdminController {
	@Autowired
	ProductService productService;
	@RequestMapping(value = "/admin/product/create", method = RequestMethod.GET)
	   public ModelAndView create() {
	      ModelAndView mav = new ModelAndView("/admin/product/create");
	      mav.addObject("product", new Products());
	      
	      return mav;
	   }
	 @RequestMapping(value = "/admin/product/create", method = RequestMethod.POST)
	   public ModelAndView create(@ModelAttribute("product") Products product) {
	      ModelAndView mav = new ModelAndView("/admin/product/create");
	      System.out.print("Alo Hehehe");
	      productService.insertProduct(product); 
	      return mav;
	   }
	   
	   @RequestMapping(value = "/admin/product/list", method = RequestMethod.GET)
	   public ModelAndView list() {
	      ModelAndView mav = new ModelAndView("/admin/product/list");
	      mav.addObject("products", productService.getListProducts());
	      return mav;
	   }
	   @RequestMapping(value = "DeleteProduct/{id}")
	   public String delete(@PathVariable int id,HttpServletRequest req) {
	   productService.deleteProduct(id);
	   return "redirect:/admin/product/list";
	   } 
	   @RequestMapping(value = "/EditProduct/{id}", method = RequestMethod.GET)
	   public ModelAndView getEdit(@PathVariable int id,@ModelAttribute("product") Products product) {
		 
	      ModelAndView mav = new ModelAndView("/admin/product/edit");
	      mav.addObject("products", productService.getListProducts());
	      mav.addObject("ProductId", productService.GetProductById(id));
	      return mav;
	   }
	   @RequestMapping(value = "/EditProduct/{id}", method = RequestMethod.POST)
	   public String postEdit(@PathVariable int id,@ModelAttribute("product") Products product,HttpServletRequest req) {
		  productService.updateProduct(product);
	      return "redirect:/admin/product/list";
	   }
	   @RequestMapping(value = "/admin/product/category/list", method = RequestMethod.GET)
	   public ModelAndView listCat() {
	      ModelAndView mav = new ModelAndView("/admin/product/category/list");
	      return mav;
	   }
}
