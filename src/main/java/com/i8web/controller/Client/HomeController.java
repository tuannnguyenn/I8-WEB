package com.i8web.controller.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.Client.CategoryServiceImpl;
import com.i8web.Service.Client.HomeServiceImpl;

@Controller
public class HomeController {
   @Autowired
   CategoryServiceImpl categoryServiceImpl;
   @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
   public ModelAndView homePage() {
      ModelAndView mav = new ModelAndView("home/home");
      mav.addObject("listCat", categoryServiceImpl.GetDataCategory());
      return mav;
   }
}