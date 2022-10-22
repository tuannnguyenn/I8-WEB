package com.i8web.entity.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperPosts implements RowMapper<Posts> {

	@Override
	public Posts mapRow(ResultSet rs, int rowNum) throws SQLException {
		Posts posts = new Posts();
		posts.setId(rs.getInt("id"));
		posts.setImage(rs.getString("image"));
		posts.setTitle(rs.getString("title"));
		posts.setDescription(rs.getString("description"));
		posts.setDate(rs.getString("date"));
		return posts;
	}

}
