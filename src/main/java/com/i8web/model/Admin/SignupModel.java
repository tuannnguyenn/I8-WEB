package com.i8web.model.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Admin.MapperUserAccount;

@Repository
public class SignupModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate = new JdbcTemplate();
	public String errorMessageString = "";

	public boolean signupAccount(String userName, String passWord, String email, String name) {
		String sql = "INSERT INTO users (id, name, username, password, email) VALUES (NULL, '" + name +"', '" + userName +"', '"+ passWord +"', '"+ email +"');";
		try {
			_jdbcTemplate.query(sql, new MapperUserAccount());
			return true;
		} catch(Exception e){
			getError(e.toString());
			return false;
		}
//				+ userName + "', '" + passWord + "', '" + email + "')";
//		_jdbcTemplate.query(sql, new MapperUserAccount());
//		return true;
	}

	public void getError(String errorStr) {
		errorMessageString = errorStr;
	}
}