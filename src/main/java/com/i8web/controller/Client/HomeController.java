package com.i8web.controller.Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.Client.HomeServiceImpl;
import com.i8web.entity.Client.Home;
import com.i8web.entity.Client.Products;
import com.i8web.Service.Client.CategoryServiceImpl;
import com.i8web.Service.Client.HomeServiceImpl;

@Controller
public class HomeController {
   @Autowired
   HomeServiceImpl homeServiceImpl;
   @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
   public ModelAndView homePage() {
      ModelAndView mav = new ModelAndView("home/home");
      mav.addObject("listCat", homeServiceImpl.GetDataCategory());
      mav.addObject("listMobile", homeServiceImpl.GetDataMobile());
      mav.addObject("listLaptop", homeServiceImpl.GetDataLaptop());
      mav.addObject("listNew", homeServiceImpl.GetDataProductNew());
      mav.addObject("listSale", homeServiceImpl.GetDataProductSale());
      return mav;
   }
}