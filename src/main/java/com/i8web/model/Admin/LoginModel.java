package com.i8web.model.Admin;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.controller.Admin.RegisterController.LoginState;
import com.i8web.entity.Admin.MapperUserAccount;
import com.i8web.entity.Admin.UserAccount;

@Repository
public class LoginModel{
	@Autowired
	public JdbcTemplate _jdbcTemplate =  new JdbcTemplate();
	public boolean checkDataLogin(String userName, String passWord) {
		List<UserAccount> list = new ArrayList<UserAccount>();
		String sql = "SELECT * FROM users WHERE username = '" + userName + "' AND password = '" + passWord + "'";
		list = _jdbcTemplate.query(sql, new MapperUserAccount());
		if (list.size() == 1) {
			LoginState.account = list.get(0);
			return true;
		}
		return false;
	}
}