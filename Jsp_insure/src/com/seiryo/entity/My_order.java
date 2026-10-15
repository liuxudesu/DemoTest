package com.seiryo.entity;

public class My_order {
	
	private String order_id;
	
	private Integer user_id;
	
	private Integer commodity_id;

	public My_order(String order_id, Integer user_id, Integer commodity_id) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.commodity_id = commodity_id;
	}

	public My_order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getCommodity_id() {
		return commodity_id;
	}

	public void setCommodity_id(Integer commodity_id) {
		this.commodity_id = commodity_id;
	}

	@Override
	public String toString() {
		return "My_order [order_id=" + order_id + ", user_id=" + user_id + ", commodity_id=" + commodity_id + "]";
	}

}
