package com.i8web.controller.Client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {
  
   @RequestMapping(value = "/gio-hang", method = RequestMethod.GET)
   public ModelAndView CartPage() {
      ModelAndView mav = new ModelAndView("cart/cart");
      return mav;
   }
}