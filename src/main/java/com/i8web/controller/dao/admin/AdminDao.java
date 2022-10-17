package com.i8web.controller.dao.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.i8web.controller.models.admin.Admin;
import com.i8web.controller.models.admin.AdminMapper;
@Repository
@Transactional
public class AdminDao {
  @Autowired
  private JdbcTemplate jdbcTemplate;
  public List<Admin> findAll() {
    String sql = "SELECT * FROM posts";
    return jdbcTemplate.query(sql, new AdminMapper());
  }
}