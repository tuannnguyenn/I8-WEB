package com.i8web.controller.Client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CheckOutController {
	@RequestMapping(value="/thanh-toan", method = RequestMethod.GET)
	public ModelAndView checkoutpage() {
		ModelAndView mav = new ModelAndView ("checkout/checkout");
		return mav;
	}

}
