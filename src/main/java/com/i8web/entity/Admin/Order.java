package com.i8web.entity.Admin;


public class Order{
	private int id;
	private String fullname;
	private String address;
	private String phone;
	private String note;
	private String pay;
	private String created_at;
	private String bill_num;
	private String bill_detail;
	private String bill_total;
	private String status;
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public String getBill_num() {
		return bill_num;
	}
	public void setBill_num(String bill_num) {
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Order() {
		super();
	}
}