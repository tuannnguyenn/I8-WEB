package com.i8web.model.Client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Client.MapperHome;
import com.i8web.entity.Client.Home;

@Repository
public class HomeModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<Home> GetDataHome() {
		List<Home> list = new ArrayList<Home>();
		String sql = "SELECT * FROM categories";
		list = _jdbcTemplate.query(sql, new MapperHome());
		return list;
	}
}
