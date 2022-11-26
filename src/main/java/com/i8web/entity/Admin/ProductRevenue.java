package com.i8web.entity.Admin;

public class ProductRevenue {
	private int id;
	private String name;
	private double revenue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRevenue() {
		return (int)revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = (int)revenue;
	}
}
