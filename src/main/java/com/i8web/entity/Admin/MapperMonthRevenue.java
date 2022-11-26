package com.i8web.entity.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperMonthRevenue implements RowMapper<MonthRevenue> {

	@Override
	public MonthRevenue mapRow(ResultSet rs, int rowNum) throws SQLException {
		MonthRevenue monthRevenue = new MonthRevenue();
		monthRevenue.setYear(rs.getInt("year"));
		monthRevenue.setMonth(rs.getInt("month"));
		monthRevenue.setSum(rs.getInt("sum"));
		return monthRevenue;
	}
}