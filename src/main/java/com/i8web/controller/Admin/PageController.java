package com.i8web.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping(value = "/admin/page/create", method = RequestMethod.GET)
	   public ModelAndView create() {
	      ModelAndView mav = new ModelAndView("/admin/page/create");
	      return mav;
	   }
	@RequestMapping(value = "/admin/page/list", method = RequestMethod.GET)
	   public ModelAndView list() {
	      ModelAndView mav = new ModelAndView("/admin/page/list");
	      return mav;
	   }
}
