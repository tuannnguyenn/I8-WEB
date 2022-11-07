package com.i8web.entity.Client;

import java.text.NumberFormat;
import java.util.Locale;

public class CartItem {
	private Integer id;
	private String image;
	private String name;
	private String price;
	private int quantity = 0;
	private String amount;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String price, int quantity) {
		Locale localeVN = new Locale("vi", "VN");
	    NumberFormat currencyVN = NumberFormat.getInstance(localeVN);
		String check=price;
		check = check.replace(".","");
		check = check.replace("Đ","");
		check = check.replace("₫","");
		long total = Long.parseLong(check) * quantity;
		String str= currencyVN.format(total);
		this.amount = str + "Đ";
	}

}
