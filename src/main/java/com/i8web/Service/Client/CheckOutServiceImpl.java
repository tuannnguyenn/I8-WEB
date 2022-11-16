package com.i8web.Service.Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.i8web.entity.Client.CheckOut;




@Service
@SessionScope
public class CheckOutServiceImpl implements ICheckOutService{

	Map<Integer,CheckOut> maps = new HashMap<>();
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public void save(CheckOut Cart) {
		try {
			jdbcTemplate.update("INSERT INTO `orders`"
					+ "(`fullname`, `address`, `phone`, `note`, `pay`, `created_at`, `bill_num`, `bill_detail`, `bill_total`)" 
					+ "VALUES (?,?,?,?,?,?,?,?,?)"
					,Cart.getUser().getName(),Cart.getUser().getAddress(),Cart.getUser().getPhone(),
					Cart.getUser().getNote(),Cart.getStatus(),Cart.getDay(),Cart.getBill_num(),Cart.getBill_detail(),
					Cart.getBill_total());
		} catch (Exception e) {
			System.out.print(e);
		}
	}
	
	public Boolean checkvalid(String name,String email,String address,String phone,String note,String method)
	{
		if(name =="" || email=="" || note == "" || phone == ""|| address=="" || method =="")
		{
			return false;
		}
		return true;
	}
	
}
