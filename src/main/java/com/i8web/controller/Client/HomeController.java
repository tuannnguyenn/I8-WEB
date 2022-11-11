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
   
// Lọc sản phẩm theo giá
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	protected void Search(HttpServletRequest request, HttpServletResponse response) throws IOException {
	  PrintWriter out = response.getWriter();
	  response.setContentType("text/html;charset=UTF-8");
	  String key = request.getParameter("search_name");
	  List<Home> listPr = homeServiceImpl.GetSearchData(key);	  
//	  for(Home o: listPr) {
//		  out.println("<li>\n"
//				  + "                                <a href=\"/i8-web/chi-tiet-san-pham/"+o.getSlug()+"?id="+o.getId()+"\" title=\"\" class=\"thumb\">\n"
//				  + "                                    <img src=\"/i8-web/resources/assets/images/"+o.getImage()+"\">"
//				  + "                                </a>\n"
//				  + "                                <a href=\"/i8-web/chi-tiet-san-pham/"+o.getSlug()+"?id="+o.getId()+"\" title=\"\" class=\"product-name\">"+o.getName()+"</a>\n"
//				  + "                                <div class=\"price\">\n"
//				  + "                                     <span class=\"new\">"+o.getPrice_new()+"</span>\n"
//				  + "                                     <span class=\"old\">"+o.getPrice_old()+"</span>\n"
//				  + "                                </div>\n"
//				  + "                                <div class=\"action clearfix\">\n"
//				  + "                                     <a href=\"/i8-web/gio-hang/add/"+o.getId()+"\" title=\"Thêm giỏ hàng\" class=\"add-cart fl-left\">Thêm giỏ hàng</a>\n"
//				  + "                                     <a href=\"/i8-web/thanh-toan\" title=\"Mua ngay\" class=\"buy-now fl-right\">Mua ngay</a>\n"
//				  + "                                </div>\n"
//				  + "                            </li>");
//	  }
	}
}