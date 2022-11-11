package com.i8web.controller.Client;

import java.io.IOException;
import java.io.PrintWriter;
//import java.text.DecimalFormat;
//import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.i8web.Service.Client.ProductsServiceImpl;
import com.i8web.entity.Client.Products;


@Controller
public class ProductsController {
	@Autowired
	ProductsServiceImpl productsServiceImpl;
	@RequestMapping(value = "/{slug}", method = RequestMethod.GET)
	public ModelAndView CategoryProductsPage(HttpServletRequest req) {	  
		  //Lấy id		
		  String id = req.getParameter("id");
//		  DecimalFormat formatter = new DecimalFormat("###,###,###.##");
		  // Đẩy dữ liệu qua view		  
	      ModelAndView mav = new ModelAndView("product/category_product");
	      mav.addObject("listCat", productsServiceImpl.GetDataCategory());
	      mav.addObject("listProduct", productsServiceImpl.GetProductsByCatId(Integer.parseInt(id)));
	      mav.addObject("listBrand", productsServiceImpl.GetBrandById(Integer.parseInt(id)));
	      mav.addObject("CatId", productsServiceImpl.GetCategoryById(Integer.parseInt(id)));
	      return mav;
	}
	@RequestMapping(value = "/chi-tiet-san-pham/{slug}", method = RequestMethod.GET)
	   public ModelAndView DetailProductsPage(HttpServletRequest req) {
			//Lấy id		
		  String id = req.getParameter("id");
		  // Đẩy dữ liệu qua view	
	      ModelAndView mav = new ModelAndView("product/detail_product");
	      mav.addObject("listCat", productsServiceImpl.GetDataCategory());
	      mav.addObject("ProductId", productsServiceImpl.GetProductsById(Integer.parseInt(id)));
	      return mav;
	}
	// Lọc sản phẩm theo giá
	@RequestMapping(value = "/filter_data", method = RequestMethod.POST)
	protected void filterData(HttpServletRequest request, HttpServletResponse response) throws IOException {
//	  List<Products> listPr = new ArrayList<Products>();
	  PrintWriter out = response.getWriter();
	  response.setContentType("text/html;charset=UTF-8");
	  String category_id = request.getParameter("category_id");
	  String price_new = request.getParameter("price_new");
	  String brand = request.getParameter("brand");
	  String filter_order = request.getParameter("filter_order");	  
	  List<Products> listPr = productsServiceImpl.GetDataProductsFilter(Integer.parseInt(category_id), price_new, filter_order, brand);	  
	  for(Products o: listPr) {
		  out.println("<li>\n"
				  + "                                <a href=\"/i8-web/chi-tiet-san-pham/"+o.getSlug()+"?id="+o.getId()+"\" title=\"\" class=\"thumb\">\n"
				  + "                                    <img src=\"/i8-web/resources/assets/images/"+o.getImage()+"\">"
				  + "                                </a>\n"
				  + "                                <a href=\"/i8-web/chi-tiet-san-pham/"+o.getSlug()+"?id="+o.getId()+"\" title=\"\" class=\"product-name\">"+o.getName()+"</a>\n"
				  + "                                <div class=\"price\">\n"
				  + "                                     <span class=\"new\">"+o.getPrice_new()+"</span>\n"
				  + "                                     <span class=\"old\">"+o.getPrice_old()+"</span>\n"
				  + "                                </div>\n"
				  + "                                <div class=\"action clearfix\">\n"
				  + "                                     <a href=\"/i8-web/gio-hang/add/"+o.getId()+"\" title=\"Thêm giỏ hàng\" class=\"add-cart fl-left\">Thêm giỏ hàng</a>\n"
				  + "                                     <a href=\"/i8-web/thanh-toan\" title=\"Mua ngay\" class=\"buy-now fl-right\">Mua ngay</a>\n"
				  + "                                </div>\n"
				  + "                            </li>");
	  }
	}
}