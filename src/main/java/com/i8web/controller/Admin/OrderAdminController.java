package com.i8web.controller.Admin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.model.Admin.OrderModel;

@Controller
public class OrderAdminController {
	@Autowired
	OrderModel orderModel;

	@RequestMapping(value = "/admin/order/list", method = RequestMethod.GET)
	public ModelAndView list(HttpSession session) {
		if (session.getAttribute("adminAccount") == null) {
			ModelAndView mav = new ModelAndView("admin/register/login");
			mav.addObject("isError", false);
			return mav;
		}
		ModelAndView mav = new ModelAndView("/admin/order/list");
		mav.addObject("orders", orderModel.getData());
		return mav;
	}
	
	@RequestMapping(value = "/admin/order/detail", method = RequestMethod.GET)
	public ModelAndView detail(HttpSession session) {
		if (session.getAttribute("adminAccount") == null) {
			ModelAndView mav = new ModelAndView("admin/register/login");
			mav.addObject("isError", false);
			return mav;
		}
		ModelAndView mav = new ModelAndView("/admin/order/detail");
		mav.addObject("orders", orderModel.getData());
		return mav;
	}
}
