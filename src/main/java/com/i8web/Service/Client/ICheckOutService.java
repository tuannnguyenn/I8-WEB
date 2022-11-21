package com.i8web.Service.Client;

import java.util.Collection;

import com.i8web.entity.Client.CartItem;
import com.i8web.entity.Client.CheckOut;

public interface ICheckOutService {
	public void save(CheckOut Cart, String username);
	public void save_billdetail(Collection<CartItem> bill);
}
