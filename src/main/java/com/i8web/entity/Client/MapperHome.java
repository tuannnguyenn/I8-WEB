package com.i8web.entity.Client;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperHome implements RowMapper<Home> {

	@Override
	public Home mapRow(ResultSet rs, int rowNum) throws SQLException {
		Home home = new Home();
		home.setId(rs.getInt("id"));
		home.setName(rs.getString("name"));
		home.setSlug(rs.getString("slug"));
		home.setCat_id(rs.getString("cat_id"));
		home.setCreated_at(rs.getString("created_at"));
		return home;
	}
}

