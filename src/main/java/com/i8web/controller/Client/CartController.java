package com.i8web.controller.Client;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.i8web.Service.Client.IProductsService;
import com.i8web.Service.Client.IShoppingCartService;
import com.i8web.entity.Client.CartItem;
import com.i8web.entity.Client.Products;

@Controller
public class CartController {
  
	@Autowired
	IProductsService productService;
	@Autowired
	IShoppingCartService cartService;
	
<<<<<<< HEAD
	
=======
>>>>>>> nghia
   @RequestMapping(value = "/gio-hang", method = RequestMethod.GET)
   public ModelAndView CartPage(HttpSession session) {
	  session.setAttribute("CART",cartService.getAllItems());
	  session.setAttribute("ITEMS",cartService.getCount());
	  session.setAttribute("TOTAL",cartService.getTotal());
      ModelAndView mav = new ModelAndView("cart/cart");
      return mav;
   }
   
	@GetMapping("/gio-hang/add/{id}")
	   public String addCart(@PathVariable("id") Integer id) {
		Products product = productService.findProductById(id);
		CartItem item = new CartItem();
		if (product!=null){
<<<<<<< HEAD
			int temp = 0;
=======
>>>>>>> nghia
			item.setId(product.getId());
			item.setImage(product.getImage());
			item.setName(product.getName());
			item.setPrice(product.getPrice_new());
			item.setQuantity(1);
			item.setAmount(item.getPrice(),item.getQuantity());
			cartService.add(item);
		}
		return "redirect:/gio-hang";
	}
	
<<<<<<< HEAD
=======
	@RequestMapping(value = "/gio-hang/additems/{id}", method = RequestMethod.POST)
	   public String addCarts(@PathVariable("id") Integer id, @RequestParam("num-order") String quantity) {
		Products product = productService.findProductById(id);
		CartItem item = new CartItem();
		if (product!=null){
			if(quantity == "0" || quantity == "" ){
				quantity ="1";
			}
			item.setId(product.getId());
			item.setImage(product.getImage());
			item.setName(product.getName());
			item.setPrice(product.getPrice_new());
			item.setQuantity(Integer.parseInt(quantity));
			item.setAmount(item.getPrice(),item.getQuantity());
			cartService.add(item);
		}
		return "redirect:/gio-hang";
	}
	
>>>>>>> nghia
	@GetMapping("/gio-hang/del/{id}")
	public String delete(@PathVariable("id") Integer id) {
		cartService.remove(id);
		return "redirect:/gio-hang";
	}
	
	@PostMapping("/gio-hang/update")
	public String update(@RequestParam("id") Integer id,@RequestParam("quantity") Integer quantity){
		cartService.update(id, quantity);
		return "redirect:/gio-hang";
	}
	
	@GetMapping("/gio-hang/clear")
	public String clear(){
		cartService.clear();
		return "redirect:/gio-hang";
	}
	
	
}