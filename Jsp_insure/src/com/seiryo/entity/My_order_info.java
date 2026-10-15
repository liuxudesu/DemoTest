package com.seiryo.entity;

public class My_order_info extends My_order{
	
	private Integer order_info_id;
	
	private String order_commodity_liability1;
	
	private String order_commodity_liability2;
	
	private String order_commodity_liability3;
	
	private String order_commodity_liability4;
	
	private String order_commodity_liability5;
	
	private String order_commodity_liability6;
	
	private String order_commodity_liability7;
	
	private String order_beneficiary_name;
	
	private String order_beneficiary_city;
	
	private String order_beneficiary_phone;

	private String order_commodity_time_start;
	
	private String order_commodity_time_end;
	
	private String order_commodity_time_length;
	
	private String order_sum_price;

	public My_order_info(String order_id, Integer user_id, Integer commodity_id, Integer order_info_id,
			String order_commodity_liability1, String order_commodity_liability2, String order_commodity_liability3,
			String order_commodity_liability4, String order_commodity_liability5, String order_commodity_liability6,
			String order_commodity_liability7, String order_beneficiary_name, String order_beneficiary_city,
			String order_beneficiary_phone, String order_commodity_time_start, String order_commodity_time_end,
			String order_commodity_time_length, String order_sum_price) {
		super(order_id, user_id, commodity_id);
		this.order_info_id = order_info_id;
		this.order_commodity_liability1 = order_commodity_liability1;
		this.order_commodity_liability2 = order_commodity_liability2;
		this.order_commodity_liability3 = order_commodity_liability3;
		this.order_commodity_liability4 = order_commodity_liability4;
		this.order_commodity_liability5 = order_commodity_liability5;
		this.order_commodity_liability6 = order_commodity_liability6;
		this.order_commodity_liability7 = order_commodity_liability7;
		this.order_beneficiary_name = order_beneficiary_name;
		this.order_beneficiary_city = order_beneficiary_city;
		this.order_beneficiary_phone = order_beneficiary_phone;
		this.order_commodity_time_start = order_commodity_time_start;
		this.order_commodity_time_end = order_commodity_time_end;
		this.order_commodity_time_length = order_commodity_time_length;
		this.order_sum_price = order_sum_price;
	}

	public My_order_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public My_order_info(String order_id, Integer user_id, Integer commodity_id) {
		super(order_id, user_id, commodity_id);
		// TODO Auto-generated constructor stub
	}

	public Integer getOrder_info_id() {
		return order_info_id;
	}

	public void setOrder_info_id(Integer order_info_id) {
		this.order_info_id = order_info_id;
	}

	public String getOrder_commodity_liability1() {
		return order_commodity_liability1;
	}

	public void setOrder_commodity_liability1(String order_commodity_liability1) {
		this.order_commodity_liability1 = order_commodity_liability1;
	}

	public String getOrder_commodity_liability2() {
		return order_commodity_liability2;
	}

	public void setOrder_commodity_liability2(String order_commodity_liability2) {
		this.order_commodity_liability2 = order_commodity_liability2;
	}

	public String getOrder_commodity_liability3() {
		return order_commodity_liability3;
	}

	public void setOrder_commodity_liability3(String order_commodity_liability3) {
		this.order_commodity_liability3 = order_commodity_liability3;
	}

	public String getOrder_commodity_liability4() {
		return order_commodity_liability4;
	}

	public void setOrder_commodity_liability4(String order_commodity_liability4) {
		this.order_commodity_liability4 = order_commodity_liability4;
	}

	public String getOrder_commodity_liability5() {
		return order_commodity_liability5;
	}

	public void setOrder_commodity_liability5(String order_commodity_liability5) {
		this.order_commodity_liability5 = order_commodity_liability5;
	}

	public String getOrder_commodity_liability6() {
		return order_commodity_liability6;
	}

	public void setOrder_commodity_liability6(String order_commodity_liability6) {
		this.order_commodity_liability6 = order_commodity_liability6;
	}

	public String getOrder_commodity_liability7() {
		return order_commodity_liability7;
	}

	public void setOrder_commodity_liability7(String order_commodity_liability7) {
		this.order_commodity_liability7 = order_commodity_liability7;
	}

	public String getOrder_beneficiary_name() {
		return order_beneficiary_name;
	}

	public void setOrder_beneficiary_name(String order_beneficiary_name) {
		this.order_beneficiary_name = order_beneficiary_name;
	}

	public String getOrder_beneficiary_city() {
		return order_beneficiary_city;
	}

	public void setOrder_beneficiary_city(String order_beneficiary_city) {
		this.order_beneficiary_city = order_beneficiary_city;
	}

	public String getOrder_beneficiary_phone() {
		return order_beneficiary_phone;
	}

	public void setOrder_beneficiary_phone(String order_beneficiary_phone) {
		this.order_beneficiary_phone = order_beneficiary_phone;
	}

	public String getOrder_commodity_time_start() {
		return order_commodity_time_start;
	}

	public void setOrder_commodity_time_start(String order_commodity_time_start) {
		this.order_commodity_time_start = order_commodity_time_start;
	}

	public String getOrder_commodity_time_end() {
		return order_commodity_time_end;
	}

	public void setOrder_commodity_time_end(String order_commodity_time_end) {
		this.order_commodity_time_end = order_commodity_time_end;
	}

	public String getOrder_commodity_time_length() {
		return order_commodity_time_length;
	}

	public void setOrder_commodity_time_length(String order_commodity_time_length) {
		this.order_commodity_time_length = order_commodity_time_length;
	}

	public String getOrder_sum_price() {
		return order_sum_price;
	}

	public void setOrder_sum_price(String order_sum_price) {
		this.order_sum_price = order_sum_price;
	}

	@Override
	public String toString() {
		return "My_order_info [order_info_id=" + order_info_id + ", order_commodity_liability1="
				+ order_commodity_liability1 + ", order_commodity_liability2=" + order_commodity_liability2
				+ ", order_commodity_liability3=" + order_commodity_liability3 + ", order_commodity_liability4="
				+ order_commodity_liability4 + ", order_commodity_liability5=" + order_commodity_liability5
				+ ", order_commodity_liability6=" + order_commodity_liability6 + ", order_commodity_liability7="
				+ order_commodity_liability7 + ", order_beneficiary_name=" + order_beneficiary_name
				+ ", order_beneficiary_city=" + order_beneficiary_city + ", order_beneficiary_phone="
				+ order_beneficiary_phone + ", order_commodity_time_start=" + order_commodity_time_start
				+ ", order_commodity_time_end=" + order_commodity_time_end + ", order_commodity_time_length="
				+ order_commodity_time_length + ", order_sum_price=" + order_sum_price + "]";
	}

}
