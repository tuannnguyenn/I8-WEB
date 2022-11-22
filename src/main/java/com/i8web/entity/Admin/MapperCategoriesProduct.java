package com.i8web.entity.Admin;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class MapperCategoriesProduct implements RowMapper<CategoriesProduct> {
	@Override
	public CategoriesProduct mapRow(ResultSet rs,int rowNum) throws SQLException {
		CategoriesProduct categoriesProduct = new CategoriesProduct();
		categoriesProduct.setId(rs.getInt("id"));
		categoriesProduct.setName(rs.getString("name"));
		categoriesProduct.setSlug(rs.getString("slug"));
		categoriesProduct.setCat_id(rs.getString("cat_id"));
		categoriesProduct.setCreated_at(rs.getString("created_at"));
		return categoriesProduct;
	}
}
