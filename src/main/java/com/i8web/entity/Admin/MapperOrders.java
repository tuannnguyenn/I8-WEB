package com.i8web.entity.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperOrders implements RowMapper<Order> {

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order order = new Order();
		order.setId(rs.getInt("id"));
		order.setCreated_at(rs.getString("created_at"));
		order.setCode(rs.getString("code"));
		order.setEmail(rs.getString("email"));
		order.setPhone(rs.getString("phone"));
		order.setImg(rs.getString("image"));
		order.setName(rs.getString("name"));
		order.setNameProduct(rs.getString("nameProduct"));
		order.setPrice(rs.getString("price"));
		order.setTotalPrice(rs.getString("totalPrice"));
		order.setNumber(rs.getString("number"));
		return order;
	}

}
