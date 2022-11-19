package com.i8web.entity.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperOrders implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order = new Order();
		order.setId(rs.getInt("id"));
		order.setAddress(rs.getString("address"));
		order.setBill_detail(rs.getString("bill_detail"));
		order.setBill_num(rs.getString("bill_num"));
		order.setBill_total(rs.getString("bill_total"));
		order.setCreated_at(rs.getString("created_at"));
		order.setFullname(rs.getString("fullname"));
		order.setNote(rs.getString("note"));
		order.setPay(rs.getString("pay"));
		order.setPhone(rs.getString("phone"));
		order.setStatus(rs.getString("status"));
		return order;
	}

}
