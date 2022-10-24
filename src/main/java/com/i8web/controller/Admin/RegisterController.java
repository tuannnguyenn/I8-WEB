package com.i8web.controller.Admin;

import com.i8web.model.Admin.LoginModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
    @Autowired
    public LoginModel loginModel;

    public static class LoginState {
        public static boolean isLogin = false;
    }

    @RequestMapping(value = "/admin/login", method = RequestMethod.GET)
    public ModelAndView loginPage() {
        ModelAndView mav = new ModelAndView("admin/login/login");
        return mav;
    }

    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public ModelAndView checkLogin(@RequestParam("username") String username,
            @RequestParam("password") String password) {
        if (loginModel.checkDataLogin(username, password)) {
            LoginState.isLogin = true;
            ModelAndView mav = new ModelAndView("admin/order/list");
            return mav;
        } else {
            ModelAndView mav = new ModelAndView("admin/login/login");
            mav.addObject("isError", true);
            return mav;
        }
    }
}