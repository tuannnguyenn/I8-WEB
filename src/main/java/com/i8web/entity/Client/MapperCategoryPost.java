package com.i8web.entity.Client;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategoryPost implements RowMapper<CategoryPost> {

	@Override
	public CategoryPost mapRow(ResultSet rs, int rowNum) throws SQLException {
		CategoryPost category = new CategoryPost();
		category.setId(rs.getInt("id"));
		category.setName(rs.getString("name"));
		category.setSlug(rs.getString("slug"));
		category.setCreated_at(rs.getString("created_at"));
		return category;
	}
	
}
