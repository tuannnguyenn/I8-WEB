package com.i8web.entity.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSliders implements RowMapper<Sliders>{
	@Override
	public Sliders mapRow(ResultSet rs, int rowNum) throws SQLException {
		Sliders sliders = new Sliders();
		sliders.setId(rs.getInt("id"));
		sliders.setImage(rs.getString("image"));
		sliders.setCreated_at(rs.getString("created_at"));
		return sliders;
	}
}
