package com.i8web.model.Admin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.i8web.entity.Admin.AProductByCate;
import com.i8web.entity.Admin.MapperAProductByCate;
import com.i8web.entity.Admin.MapperMonthRevenue;
import com.i8web.entity.Admin.MapperProductRevenue;
import com.i8web.entity.Admin.MonthRevenue;
import com.i8web.entity.Admin.ProductRevenue;




@Repository
public class ReportModel {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	//Thong ke san pham theo danh muc
	  public List<AProductByCate> GetListAProductByCate(){
	        List<AProductByCate> list = new ArrayList<AProductByCate>();
	        String sql = "SELECT * FROM amount_productbycate";
	        list = _jdbcTemplate.query(sql,new MapperAProductByCate());
	        return list;
	    }
	  //Thong ke doanh thu theo san pham
	  public void dropTableProductRevenue() {
		  String sql = "drop table product_revenue";
		  _jdbcTemplate.update(sql);
	  }
	  
	  public void createTableProductRevenue() {
		  String sql = " create table product_revenue as select p.id,p.name,sum(p_o.quantity)*p.price_new as revenue from product_order as p_o inner join products as p on p_o.id_product = p.id group by p_o.id_product;";
		  _jdbcTemplate.update(sql);
	  }
	  public void createTableProductRevenueByCate(int kw) {
		  String sql = "create table product_revenue as select p.id,p.name,sum(p_o.quantity)*p.price_new as revenue from product_order as p_o inner join products as p on p_o.id_product = p.id   WHERE  p.product_id = ? group by p_o.id_product;";
		  _jdbcTemplate.update(sql, kw);
	  }
	  public void createTableProductRevenueByTime(String fromDate,String toDate) {
		  String sql = "create table product_revenue as select p.id,p.name,sum(p_o.quantity)*p.price_new as revenue from product_order as p_o inner join products as p on p_o.id_product = p.id   WHERE (Date(p_o.created_at) BETWEEN ? AND ?) group by p_o.id_product;";
		  _jdbcTemplate.update(sql,fromDate,toDate);
	  }
	  public void createTableProductRevenueByTimeAndCate(String fromDate,String toDate, int kw) {
		  String sql = "create table product_revenue as select p.id,p.name,sum(p_o.quantity)*p.price_new as revenue from product_order as p_o inner join products as p on p_o.id_product = p.id   WHERE (Date(p_o.created_at) BETWEEN ? AND ?) and (p.product_id = ?) group by p_o.id_product;";
		  _jdbcTemplate.update(sql,fromDate,toDate,kw);
	  }
	  public List<ProductRevenue> GetListProductRevenue(){
	        List<ProductRevenue> list = new ArrayList<ProductRevenue>();
	        String sql = "SELECT * FROM product_revenue";
	        list = _jdbcTemplate.query(sql,new MapperProductRevenue());
	        return list;
	    }
	  //Thong ke doanh thu theo thang
	  public void dropTableMonthRevenue() {
		  String sql = "drop table month_revenue";
		  _jdbcTemplate.update(sql);
	  } 
	  public void createTableMonthRevenue() {
		  String sql = "create table month_revenue as SELECT year(created_at) as year, month(created_at) as month, sum(price) as sum FROM product_order GROUP BY concat(year(created_at), month(created_at));";
		  _jdbcTemplate.update(sql);
	  }
	  public void createTableMonthRevenueByCate(int kw) {
		  String sql = "create table month_revenue as SELECT year(p_o.created_at) as year, month(p_o.created_at) as month, sum(p_o.price) as sum FROM product_order as p_o inner join products as p on p_o.id_product = p.id WHERE p.product_id = ? GROUP BY concat(year(p_o.created_at), month(p_o.created_at));";
		  _jdbcTemplate.update(sql,kw);
	  }
	  public void createTableMonthRevenueByTime(String fromDate,String toDate) {
		  String sql = "create table month_revenue as SELECT year(created_at) as year, month(created_at) as month, sum(price) as sum FROM product_order WHERE Date(created_at) between ? and ? GROUP BY concat(year(created_at), month(created_at));";
		  _jdbcTemplate.update(sql,fromDate,toDate);
	  }
	
	  public void createTableMonthRevenueByTimeAndCate(String fromDate,String toDate, int kw) {
		  String sql = "create table month_revenue as SELECT year(p_o.created_at) as year, month(p_o.created_at) as month, sum(p_o.price) as sum FROM product_order as p_o inner join products as p on p_o.id_product = p.id WHERE (Date(p_o.created_at) between ? and ? ) and p.product_id = ? GROUP BY concat(year(p_o.created_at), month(p_o.created_at));";
		  _jdbcTemplate.update(sql,fromDate,toDate,kw);
	  }
	  public List<MonthRevenue> GetListMonthRevenue(){
	        List<MonthRevenue> list = new ArrayList<MonthRevenue>();
	        String sql = "SELECT * FROM month_revenue";
	        list = _jdbcTemplate.query(sql,new MapperMonthRevenue());
	        return list;
	    }
}
