package com.i8web.controller.models.admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AdminMapper implements RowMapper<Admin>
{
	public Admin mapRow(ResultSet rs,int rowNum) throws SQLException {
		Admin user = new Admin ();
		user.setId(rs.getInt("id"));
		user.setImage(rs.getString("image"));
		user.setTitle(rs.getString("title"));
        user.setDate(rs.getString("date"));
		user.setDescription(rs.getString("description"));
		return user;
	}
}
