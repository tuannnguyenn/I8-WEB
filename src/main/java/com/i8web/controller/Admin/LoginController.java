package com.i8web.controller.Admin;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.i8web.entity.Admin.UserAccount;

@Controller
public class LoginController {
	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("admin/login/login");
		return mav;
	}

	public static class LoginState{
		public static boolean isLogin = false;
	}
	
	@RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
	public ModelAndView checkLogin(@RequestParam("username")String username, @RequestParam("password")String password) {
		UserAccount userAccount = new UserAccount();
		userAccount.set_userName("mchien");
		userAccount.set_passWord("mchien");
		if (userAccount.get_userName().equals(username) && userAccount.get_passWord().equals(password)) {
			ModelAndView mav = new ModelAndView("home/home");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("admin/login/login");
			return mav;
		}
	}
}