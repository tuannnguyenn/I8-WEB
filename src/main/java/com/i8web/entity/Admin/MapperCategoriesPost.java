package com.i8web.entity.Admin;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class MapperCategoriesPost implements RowMapper<CategoriesPost> {
	@Override
	public CategoriesPost mapRow(ResultSet rs,int rowNum) throws SQLException {
		CategoriesPost categoriesPost = new CategoriesPost();
		categoriesPost.setId(rs.getInt("id"));
		categoriesPost.setName(rs.getString("name"));
		categoriesPost.setSlug(rs.getString("slug"));
		categoriesPost.setCreated_at(rs.getString("created_at"));
		return categoriesPost;
	}
}