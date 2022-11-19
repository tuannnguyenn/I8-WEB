package com.i8web.model.Client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Admin.MapperUserAccount;
import com.i8web.entity.Admin.UserAccount;

@Repository
public class RegisterModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate = new JdbcTemplate();

	public boolean checkLogin(String userName, String passWord) {
		List<UserAccount> list = new ArrayList<UserAccount>();
		String sql = "SELECT * FROM users_client WHERE username = '" + userName + "' AND password = '" + passWord + "'";
		list = _jdbcTemplate.query(sql, new MapperUserAccount());
		if (list.size() == 1) {
			return true;
		}
		return false;
	}

	public String errorMessageString = "";

	public boolean signupAccount(String userName, String passWord, String email, String name) {
		String sql = "INSERT INTO users_client (id, name, username, password, email) VALUES (NULL, '" + name + "', '"
				+ userName + "', '" + passWord + "', '" + email + "')";
		try {
			_jdbcTemplate.update(sql);
			return true;
		} catch (Exception e) {
			getError(e.toString());
			return false;
		}
	}

	public void getError(String errorStr) {
		errorMessageString = errorStr;
	}
}