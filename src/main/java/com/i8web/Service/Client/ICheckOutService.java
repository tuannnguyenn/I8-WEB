package com.i8web.Service.Client;

import com.i8web.entity.Client.CheckOut;

public interface ICheckOutService {
	public void save(CheckOut Cart);
	public Boolean checkvalid(String name,String email,String address,String phone,String note,String method);
}
