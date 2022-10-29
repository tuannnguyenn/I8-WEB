package com.i8web.entity.Client;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProducts implements RowMapper<Products> {

	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		Products products = new Products();
		products.setId(rs.getInt("id"));
		products.setName(rs.getString("name"));
		products.setPrice_old(rs.getString("price_old"));
		products.setPrice_new(rs.getString("price_new"));
		products.setDescription(rs.getString("description"));
		products.setStatus(rs.getString("status"));
		products.setMany_image(rs.getString("many_image"));
		products.setImage(rs.getString("image"));
		products.setDetail(rs.getString("detail"));
		products.setProduct_id(rs.getInt("product_id"));
		products.setSlug(rs.getString("slug"));
		products.setGhimSale(rs.getString("ghimSale"));
		products.setGhimNew(rs.getString("ghimNew"));
		products.setCreated_at(rs.getString("created_at"));
		return products;
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
