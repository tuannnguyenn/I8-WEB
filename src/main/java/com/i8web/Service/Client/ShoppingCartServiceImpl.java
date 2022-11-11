package com.i8web.Service.Client;

import java.text.NumberFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.i8web.entity.Client.CartItem;

@Service
@SessionScope
public class ShoppingCartServiceImpl implements IShoppingCartService {
	Map<Integer,CartItem> maps = new HashMap<>();
	
	public void add(CartItem item) {
		CartItem cartItem = maps.get(item.getId());
		if(cartItem == null) {
			maps.put(item.getId(), item);
		}else {
			cartItem.setAmount(cartItem.getPrice(),cartItem.getQuantity()+1);
			cartItem.setQuantity(cartItem.getQuantity()+1);
			

		}
	}
	public void remove(int id) {
		maps.remove(id);
	}
	public CartItem update(int proId, int quantity ) {
		CartItem cartItem = maps.get(proId);
		if(quantity ==0){
			remove(proId);
		}
		cartItem.setQuantity(quantity);
		cartItem.setAmount(cartItem.getPrice(), quantity);
		return cartItem;
	}
	
	public void clear() {
		maps.clear();
	}
	
	public Collection<CartItem> getAllItems(){
		return maps.values();
	}
	public int getCount() {
		return maps.values().size();
	}
	
	public long Total(CartItem item, long total)
	{
		String check=item.getPrice();
		check = check.replace(".","");
		check = check.replace("Đ","");
		check = check.replace("₫","");
		total += Long.parseLong(check) * item.getQuantity();
		return total;
	}
	
	public String getTotal() {
		String sum = "0";
		long total = 0;
		for(CartItem item : maps.values())
		{
			total = Total(item,total);
		}
		Locale localeVN = new Locale("vi", "VN");
	    NumberFormat currencyVN = NumberFormat.getInstance(localeVN);
		sum= currencyVN.format(total);
		return sum+ "Đ";
	}
}
