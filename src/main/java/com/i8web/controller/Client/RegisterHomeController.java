package com.i8web.controller.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.Admin.SessionService;
import com.i8web.Service.Client.HomeServiceImpl;
import com.i8web.model.Admin.LoginModel;
import com.i8web.model.Admin.SignupModel;
import com.i8web.model.Client.RegisterModel;

@Controller
public class RegisterHomeController {
	@Autowired
	RegisterModel registerModel;
	@Autowired
	SessionService sessionService;
	@Autowired
	HomeServiceImpl homeServiceImpl;

	@RequestMapping(value = "/trang-chu", method = RequestMethod.POST)
	public ModelAndView homePageLogined(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		if (registerModel.checkLogin(username, password)) {
			sessionService.set("userAccount", username);
			ModelAndView mav = new ModelAndView("home/home");
			mav.addObject("listCat", homeServiceImpl.GetDataCategory());
			mav.addObject("listMobile", homeServiceImpl.GetDataMobile());
			mav.addObject("listLaptop", homeServiceImpl.GetDataLaptop());
			mav.addObject("listNew", homeServiceImpl.GetDataProductNew());
			mav.addObject("listSale", homeServiceImpl.GetDataProductSale());
			
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("register/login");
			mav.addObject("isError", true);
			return mav;
		}
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signPageHome() {
		ModelAndView mav = new ModelAndView("register/signup");
		return mav;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginPageHome() {
		ModelAndView mav = new ModelAndView("register/login");
		return mav;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView checkSignupHome(@RequestParam("username") String username,
			@RequestParam("password") String password, @RequestParam("email") String email,
			@RequestParam("name") String name) {
		if (registerModel.signupAccount(username, password, email, name)) {
			ModelAndView mav = new ModelAndView("register/login");
			return mav;
		} else {
			ModelAndView mav = new ModelAndView("admin/register/signup");
			mav.addObject("isError", registerModel.errorMessageString);
			return mav;
		}
	}
}