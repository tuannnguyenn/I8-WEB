package com.i8web.controller.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.entity.Admin.Products;
import com.i8web.model.Admin.AccountModel;

@Controller
public class AccountController {
	@Autowired
	AccountModel accountModel;
	@RequestMapping(value = "/admin/user/list", method = RequestMethod.GET)
	   public ModelAndView listAccountUser(HttpSession session) {
		   if (session.getAttribute("adminAccount") == null) {
				ModelAndView mav = new ModelAndView("admin/register/login");
				mav.addObject("isError", false);
				return mav;
			}
		   ModelAndView mav = new ModelAndView("/admin/user/listUser");
		      mav.addObject("users", accountModel.getAllUser());
		      return mav;
		
	}
	@RequestMapping(value = "DeleteAccountUser/{id}")
	   public String deleteAccountUser(@PathVariable int id,HttpServletRequest req) {
		accountModel.deleteAccountUser(id);
	   return "redirect:/admin/user/list";
	   } 
	@RequestMapping(value = "/admin/shipper/list", method = RequestMethod.GET)
	   public ModelAndView listAccountShipper(HttpSession session) {
		   if (session.getAttribute("adminAccount") == null) {
				ModelAndView mav = new ModelAndView("admin/register/login");
				mav.addObject("isError", false);
				return mav;
			}
		   ModelAndView mav = new ModelAndView("/admin/user/listShipper");
		      mav.addObject("shippers", accountModel.getAllShipper());
		      return mav;
		
	}
	@RequestMapping(value = "DeleteAccountShipper/{id}")
	   public String deleteAccountShipper(@PathVariable int id,HttpServletRequest req) {
		accountModel.deleteAccountShipper(id);
	   return "redirect:/admin/shipper/list";
	   } 
}
