package com.i8web.entity.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperAProductByCate implements RowMapper<AProductByCate>{
	@Override
	public AProductByCate mapRow(ResultSet rs,int rowNum) throws SQLException {
		AProductByCate aProductByCate = new AProductByCate();
		aProductByCate.setId(rs.getInt("id"));
		aProductByCate.setName(rs.getString("name"));
		aProductByCate.setAmount(rs.getInt("amount"));
		
		return aProductByCate;
	}
}
