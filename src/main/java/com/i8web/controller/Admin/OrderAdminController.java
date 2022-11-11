package com.i8web.controller.Admin;

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
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("/admin/order/list");
		mav.addObject("orders", orderModel.getData());
		return mav;
	}
}
