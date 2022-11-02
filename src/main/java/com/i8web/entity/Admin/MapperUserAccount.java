package com.i8web.entity.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUserAccount implements RowMapper<UserAccount> {

	@Override
	public UserAccount mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserAccount account = new UserAccount();
		account.set_id(rs.getInt("id"));
		account.set_userName(rs.getString("username"));
		account.set_email(rs.getString("email"));
		account.set_name(rs.getString("name"));
		account.set_passWord(rs.getString("password"));
		return account;
	}

}
