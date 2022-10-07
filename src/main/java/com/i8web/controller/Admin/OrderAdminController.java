package com.i8web.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderAdminController {
	@RequestMapping(value = "/admin/order/list", method = RequestMethod.GET)
	   public ModelAndView list() {
	      ModelAndView mav = new ModelAndView("/admin/order/list");
	      return mav;
	   }
}
