package com.i8web.entity.Client;

import java.time.LocalDate;

public class CheckOut {

	private User user;
	private String status;
	private int bill_num;
	private String bill_detail;
	private String bill_total;
	private LocalDate day;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getBill_num() {
		return bill_num;
	}
	public void setBill_num(int bill_num) {
		this.bill_num = bill_num;
	}
	public String getBill_detail() {
		return bill_detail;
	}
	public void setBill_detail(String bill_detail) {
		this.bill_detail = bill_detail;
	}
	public String getBill_total() {
		return bill_total;
	}
	public void setBill_total(String bill_total) {
		this.bill_total = bill_total;
	}
	public LocalDate getDay() {
		return day;
	}
	public void setDay(LocalDate day) {
		this.day = day;
	}
	
}
