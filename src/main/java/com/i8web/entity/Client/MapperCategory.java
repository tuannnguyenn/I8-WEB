package com.i8web.entity.Client;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategory implements RowMapper<Category> {

	@Override
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		Category category = new Category();
		category.setId(rs.getInt("id"));
		category.setName(rs.getString("name"));
		category.setSlug(rs.getString("slug"));
		category.setCat_id(rs.getString("cat_id"));
		category.setCreated_at(rs.getString("created_at"));
		return category;
	}
	
}
