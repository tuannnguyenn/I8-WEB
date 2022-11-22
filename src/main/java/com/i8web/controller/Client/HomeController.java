package com.i8web.controller.Client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.Client.HomeServiceImpl;
import com.i8web.Service.Client.IShoppingCartService;
import com.i8web.entity.Client.Home;
import com.i8web.entity.Client.Products;
import com.i8web.model.Client.HomeModel;
import com.i8web.Service.Client.CategoryServiceImpl;
import com.i8web.Service.Client.HomeServiceImpl;

@Controller
public class HomeController {
   @Autowired
   HomeServiceImpl homeServiceImpl;
   @Autowired
   IShoppingCartService cartService;
   @Autowired
   HomeModel homeModel;
   @RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
   public ModelAndView homePage(HttpSession session) {
      ModelAndView mav = new ModelAndView("home/home");
      mav.addObject("listCat", homeServiceImpl.GetDataCategory());
      mav.addObject("listMobile", homeServiceImpl.GetDataMobile());
      mav.addObject("listLaptop", homeServiceImpl.GetDataLaptop());
      mav.addObject("listNew", homeServiceImpl.GetDataProductNew());
      mav.addObject("listSale", homeServiceImpl.GetDataProductSale());
      session.setAttribute("CART", cartService.getAllItems());
      session.setAttribute("ITEMS", cartService.getCount());
      session.setAttribute("TOTAL", cartService.getTotal());
      return mav;
   }
   
   @RequestMapping(value = "/search", method = RequestMethod.POST)
	protected void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
		  PrintWriter out = response.getWriter();
		  response.setContentType("text/html;charset=UTF-8");
		  String search_name = request.getParameter("search_name");
		  List<Home> listPr = homeModel.GetSearchData(search_name);
//		  System.out.println(listPr);
		  for(Home o: listPr) {
			  out.println("<li>\n"
					  + "                                <a href=\"/i8-web/chi-tiet-san-pham/"+o.getSlug()+"?id="+o.getId()+"\"><img src=\"/i8-web/resources/assets/images/"+o.getImage()+"\"></a>\n"
					  + "                                    <div class=\"d-column pl-2\">\n"
					  + "                                <a href=\"/i8-web/chi-tiet-san-pham/"+o.getSlug()+"?id="+o.getId()+"\" class=\"name-item\">"+o.getName()+"</a>\n"
					  + "                                <span class=\"price\">"+o.getPrice_new()+"</span>\n"
					  + "                                </div>\n"
					  + "                            </li>");
		  }
		}
}