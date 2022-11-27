package com.i8web.controller.Client;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.i8web.entity.Admin.Order;

import com.i8web.model.Admin.OrderModel;

@Controller
public class OrderController {
	@Autowired
	OrderModel orderModel;
   @RequestMapping(value = "/thong-tin-don-hang", method = RequestMethod.GET)
   public ModelAndView orderPage(HttpSession session) {
      ModelAndView mav = new ModelAndView("order/order");
      mav.addObject("listOrder", orderModel.getOrderByUsername(session.getAttribute("userAccount").toString()));
      return mav;
   }
   @RequestMapping(value = "/chi-tiet-don-hang/{id}", method = RequestMethod.GET)
   public ModelAndView detailPage(HttpSession session, @PathVariable int id,@ModelAttribute("order") Order order,HttpServletRequest req) {
      ModelAndView mav = new ModelAndView("order/detail");
      mav.addObject("listOrder", orderModel.GetOrderById(id));
	mav.addObject("orders", orderModel.getData());
		mav.addObject("productDetails", orderModel.getProductByOrderID(id));
      return mav;
   }
   @RequestMapping(value = "DeleteOrderClient/{id}")
   public String delete(@PathVariable int id,HttpServletRequest req) {
	   orderModel.DeleteDataOrder(id);
	   return "redirect:/thong-tin-don-hang";
   }
}
