package com.i8web.controller.Admin;

import com.i8web.Service.SessionService;
import com.i8web.entity.Admin.UserAccount;
import com.i8web.model.Admin.LoginModel;
import com.i8web.model.Admin.SignupModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@Autowired
	LoginModel loginModel;
	@Autowired
	SignupModel signupModel;
	@Autowired
	SessionService session;
	public static class LoginState {
		public static boolean isLogin = false;
		public static UserAccount account;
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		if(session.get("userAccount") != null) {
			LoginState.isLogin = true;
			ModelAndView mav = new ModelAndView("admin/order/list");
			mav.addObject("userAccount", session.get("userAccount"));
			return mav;
		}
		ModelAndView mav = new ModelAndView("admin/register/login");
		mav.addObject("isError", false);
		return mav;
	}

	@RequestMapping(value = "/useradmin/login", method = RequestMethod.POST)
	public ModelAndView checkLogin(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		if (loginModel.checkDataLogin(username, password)) {
			LoginState.isLogin = true;
			session.set("userAccount", LoginState.account);
			ModelAndView mav = new ModelAndView("admin/order/list");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("admin/register/login");
			mav.addObject("isError", true);
			return mav;
		}
	}

	@RequestMapping(value = "/admin/signup", method = RequestMethod.GET)
	public ModelAndView signPage() {
		ModelAndView mav = new ModelAndView("admin/register/signup");
		return mav;
	}

	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public ModelAndView checkSignup(@RequestParam("username") String username,
			@RequestParam("password") String password, @RequestParam("email") String email,
			@RequestParam("name") String name) {
		if (signupModel.signupAccount(username, password, email, name)) {
			ModelAndView mav = new ModelAndView("admin/register/login");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("admin/register/signup");
			mav.addObject("isError", signupModel.errorMessageString);
			return mav;
		}
	}
}