package com.i8web.Service.Client;

import java.util.Collection;

import com.i8web.entity.Client.CartItem;

public interface IShoppingCartService {
	public void add(CartItem item);
	public void remove(int id);
	public CartItem update(int proId, int quantity );
	public void clear();
	public Collection<CartItem> getAllItems();
	public int getCount();
	public String getTotal();
}
