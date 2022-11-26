package com.i8web.entity.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProductRevenue implements RowMapper<ProductRevenue> {

	@Override
	public ProductRevenue mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductRevenue productRevenue = new ProductRevenue();
		productRevenue.setId(rs.getInt("id"));
		productRevenue.setName(rs.getString("name"));
		productRevenue.setRevenue(rs.getInt("revenue"));
		return productRevenue;
	}
}
