package com.i8web.controller.Admin;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {
	@RequestMapping(value = "/admin/menu/list", method = RequestMethod.GET)
	public ModelAndView list(HttpSession session) {
		if (session.getAttribute("adminAccount") == null) {
			ModelAndView mav = new ModelAndView("admin/register/login");
			mav.addObject("isError", false);
			return mav;
		}
		ModelAndView mav = new ModelAndView("/admin/menu/list");
		return mav;
	}
}
