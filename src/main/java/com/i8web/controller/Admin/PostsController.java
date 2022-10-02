package com.i8web.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostsController {
 
   @RequestMapping(value = "/admin/post/create", method = RequestMethod.GET)
   public ModelAndView orderPage() {
      ModelAndView mav = new ModelAndView("/admin/post/create");
      return mav;
   }
}