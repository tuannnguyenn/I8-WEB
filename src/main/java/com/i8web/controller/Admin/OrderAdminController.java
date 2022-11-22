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

import com.i8web.Service.Admin.OrderServiceImpl;
import com.i8web.entity.Admin.Order;
import com.i8web.entity.Admin.Products;
import com.i8web.model.Admin.OrderModel;

@Controller
public class OrderAdminController {
	@Autowired
	OrderModel orderModel;
	OrderServiceImpl orderServiceImpl;

	@RequestMapping(value = "/admin/order/list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("/admin/order/list");
		mav.addObject("orders", orderModel.getData());
		return mav;
	}
	
	@RequestMapping(value = "/admin/order/detail/{id}", method = RequestMethod.GET)
	public ModelAndView getDetail(@PathVariable int id,@ModelAttribute("order") Order order,HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("/admin/order/detail");
		System.out.println(id);
		mav.addObject("listOrder", orderModel.GetOrderById(id));
		mav.addObject("orders", orderModel.getData());
		mav.addObject("productDetails", orderModel.getProductByOrderID(id));
		return mav;
	}
	
	@RequestMapping(value = "DeleteOrder/{id}")
	   public String delete(@PathVariable int id,HttpServletRequest req) {
	   orderModel.DeleteDataOrder(id);
	   return "redirect:/admin/order/list";
	 }
	
}
