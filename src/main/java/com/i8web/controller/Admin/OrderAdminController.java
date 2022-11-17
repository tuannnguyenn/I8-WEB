package com.i8web.controller.Admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.Admin.OrderServiceImpl;
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
	
	@RequestMapping(value = "/admin/order/detail", method = RequestMethod.GET)
	public ModelAndView detail(HttpServletRequest req) {
		ModelAndView mav = new ModelAndView("/admin/order/detail");
		String id = req.getParameter("id");
		System.out.println(id);
		mav.addObject("listOrder", orderModel.GetOrderById(Integer.parseInt(id)));
		mav.addObject("orders", orderModel.getData());
		return mav;
	}
}
