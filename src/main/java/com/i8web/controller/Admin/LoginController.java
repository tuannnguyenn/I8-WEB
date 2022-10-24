package com.i8web.controller.Admin;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.i8web.entity.Admin.UserAccount;

@Controller
public class LoginController {
	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("admin/login/login");
		return mav;
	}
//	
//	public static class LoginState{
//		public static boolean isLogin = false;
//	}
//	
//	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
//	public  ModelAndView loginPage1(@ModelAttribute(value = "account") UserAccount acc, ModelMap mm, HttpSession session) {
//		mm.put("account", acc);
//		if(acc.get_userName().equals("mchien") && acc.get_passWord().equals("mchien")) {
//			session.setAttribute("_userName", acc.get_userName());
//			ModelAndView mav = new ModelAndView("home/home");
//			return mav;
//		}else {
//			ModelAndView mav = new ModelAndView("admin/login/login");
//			return mav;	
//		}
//	}
}