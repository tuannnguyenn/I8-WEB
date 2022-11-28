package com.i8web.model.Admin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Admin.CategoriesPost;
import com.i8web.entity.Admin.MapperCategoriesPost;
import com.i8web.entity.Admin.MapperUserAccount;
import com.i8web.entity.Admin.UserAccount;
@Repository
public class AccountModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public List<UserAccount> getAllUser() {
		List<UserAccount> list = new ArrayList<UserAccount>();
		String sql = "SELECT * FROM users_client";
		list = _jdbcTemplate.query(sql, new MapperUserAccount());
		return list;
	}

	public List<UserAccount> getAllShipper() {
		List<UserAccount> list = new ArrayList<UserAccount>();
		String sql = "SELECT * FROM users_shipper";
		list = _jdbcTemplate.query(sql, new MapperUserAccount());
		return list;
	}

	public void addUser(UserAccount acc) {
		String sql = "INSERT INTO users_client(name,username, password,email)" + "VALUES(?,?,?)";
		_jdbcTemplate.update(sql, acc.get_name(), acc.get_userName() ,acc.get_passWord(), acc.get_email());
	}
	public void addShipper(UserAccount acc) {
		String sql = "INSERT INTO users_shipper(name,username, password,email)" + "VALUES(?,?,?)";
		_jdbcTemplate.update(sql, acc.get_name(), acc.get_userName() ,acc.get_passWord(), acc.get_email());
	}
	public void deleteAccountUser(int id) {
		String sql = "DELETE FROM users_client WHERE id = " + id;
		_jdbcTemplate.update(sql);
	}
	public void deleteAccountShipper(int id) {
		String sql = "DELETE FROM users_shipper WHERE id = " + id;
		_jdbcTemplate.update(sql);
	}
	public void updateAccountUser(UserAccount acc) {
		String sql = "UPDATE users_client SET name = ?,username = ?, password= ?, email = ? WHERE id = ?";
		_jdbcTemplate.update(sql, acc.get_name(), acc.get_userName() ,acc.get_passWord(), acc.get_email(), acc.get_id());
	}
	public void updateAccountShipper(UserAccount acc) {
		String sql = "UPDATE users_shipper SET name = ?,username = ?, password= ?, email = ? WHERE id = ?";
		_jdbcTemplate.update(sql, acc.get_name(), acc.get_userName() ,acc.get_passWord(), acc.get_email(), acc.get_id());
	}
	
}