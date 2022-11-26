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

import com.i8web.entity.Client.CartItem;
import com.i8web.entity.Client.CheckOut;




@Service
@SessionScope
public class CheckOutServiceImpl implements ICheckOutService{

	Map<Integer,CheckOut> maps = new HashMap<>();
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public void save(CheckOut Cart, String username) {
		try {
			jdbcTemplate.update("INSERT INTO `orders`"
					+ "(`fullname`, `address`, `phone`, `note`, `pay`, `created_at`, `bill_num`, `bill_detail`, `bill_total`, `username`)" 
					+ "VALUES (?,?,?,?,?,?,?,?,?,?)"
					,Cart.getUser().getName(),Cart.getUser().getAddress(),Cart.getUser().getPhone(),
					Cart.getUser().getNote(),Cart.getStatus(),Cart.getDay(),Cart.getBill_num(),Cart.getBill_detail(),
					Cart.getBill_total(), username);
		} catch (Exception e) {
			System.out.print(e);
		}
	}
	@Override
	public void save_billdetail(Collection<CartItem> bill) {
		try {
			String result = jdbcTemplate.queryForObject(
				    "SELECT id FROM orders ORDER BY id DESC limit 1", String.class);
			
			for(CartItem item : bill){
				
				jdbcTemplate.update("INSERT INTO product_order(id_order, id_product, quantity,created_at,price)" 
			+ "VALUES (?,?,?,?,?)",result,item.getId(),item.getQuantity(),item.getCreated_at(),Integer.parseInt(item.getPrice()) *item.getQuantity());
				jdbcTemplate.update("update product_order set created_at = (select orders.created_at from orders where orders.id = ?)",result);
			}
			
		}catch (Exception e) {
			System.out.print(e);
		}
	}
	
}
