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
		home.setPrice_old(rs.getString("price_old"));
		home.setPrice_new(rs.getString("price_new"));
		home.setDescription(rs.getString("description"));
		home.setStatus(rs.getString("status"));
		home.setMany_image(rs.getString("many_image"));
		home.setImage(rs.getString("image"));
		home.setDetail(rs.getString("detail"));
		home.setProduct_id(rs.getInt("product_id"));
		home.setSlug(rs.getString("slug"));
		home.setGhimSale(rs.getString("ghimSale"));
		home.setGhimNew(rs.getString("ghimNew"));
		home.setCreated_at(rs.getString("created_at"));
		return home;
	}
	
	public Category mapRow1(ResultSet rs, int rowNum) throws SQLException {
		Category category = new Category();
		category.setId(rs.getInt("id"));
		category.setName(rs.getString("name"));
		category.setSlug(rs.getString("slug"));
		category.setCat_id(rs.getString("cat_id"));
		category.setCreated_at(rs.getString("created_at"));
		return category;
	}
}
