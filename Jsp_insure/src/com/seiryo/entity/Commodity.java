package com.seiryo.entity;

public class Commodity {
	
	private Integer commodity_id;

	private String commodity_name;
	
	private String commodity_price;
	
	private String commodity_introduce;
	
	private String commodity_img;
	
	private Integer commodity_age_start;
	
	private Integer commodity_age_end;
	
	private String commodity_time_length;
	
	private Integer commodity_applicable_gender;
	
	private String commodity_applicable_location;
	
	private String commodity_signing_form;
	
	private String commodity_liability_zjs;
	
	private String commodity_detailed_information1;
	
	private String commodity_detailed_information2;
	
	private String commodity_detailed_information3;
	
	private String commodity_type;

	public Commodity(Integer commodity_id, String commodity_name, String commodity_price, String commodity_introduce,
			String commodity_img, Integer commodity_age_start, Integer commodity_age_end, String commodity_time_length,
			Integer commodity_applicable_gender, String commodity_applicable_location, String commodity_signing_form,
			String commodity_liability_zjs, String commodity_detailed_information1,
			String commodity_detailed_information2, String commodity_detailed_information3, String commodity_type) {
		super();
		this.commodity_id = commodity_id;
		this.commodity_name = commodity_name;
		this.commodity_price = commodity_price;
		this.commodity_introduce = commodity_introduce;
		this.commodity_img = commodity_img;
		this.commodity_age_start = commodity_age_start;
		this.commodity_age_end = commodity_age_end;
		this.commodity_time_length = commodity_time_length;
		this.commodity_applicable_gender = commodity_applicable_gender;
		this.commodity_applicable_location = commodity_applicable_location;
		this.commodity_signing_form = commodity_signing_form;
		this.commodity_liability_zjs = commodity_liability_zjs;
		this.commodity_detailed_information1 = commodity_detailed_information1;
		this.commodity_detailed_information2 = commodity_detailed_information2;
		this.commodity_detailed_information3 = commodity_detailed_information3;
		this.commodity_type = commodity_type;
	}

	public Commodity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCommodity_id() {
		return commodity_id;
	}

	public void setCommodity_id(Integer commodity_id) {
		this.commodity_id = commodity_id;
	}

	public String getCommodity_name() {
		return commodity_name;
	}

	public void setCommodity_name(String commodity_name) {
		this.commodity_name = commodity_name;
	}

	public String getCommodity_price() {
		return commodity_price;
	}

	public void setCommodity_price(String commodity_price) {
		this.commodity_price = commodity_price;
	}

	public String getCommodity_introduce() {
		return commodity_introduce;
	}

	public void setCommodity_introduce(String commodity_introduce) {
		this.commodity_introduce = commodity_introduce;
	}

	public String getCommodity_img() {
		return commodity_img;
	}

	public void setCommodity_img(String commodity_img) {
		this.commodity_img = commodity_img;
	}

	public Integer getCommodity_age_start() {
		return commodity_age_start;
	}

	public void setCommodity_age_start(Integer commodity_age_start) {
		this.commodity_age_start = commodity_age_start;
	}

	public Integer getCommodity_age_end() {
		return commodity_age_end;
	}

	public void setCommodity_age_end(Integer commodity_age_end) {
		this.commodity_age_end = commodity_age_end;
	}

	public String getCommodity_time_length() {
		return commodity_time_length;
	}

	public void setCommodity_time_length(String commodity_time_length) {
		this.commodity_time_length = commodity_time_length;
	}

	public Integer getCommodity_applicable_gender() {
		return commodity_applicable_gender;
	}

	public void setCommodity_applicable_gender(Integer commodity_applicable_gender) {
		this.commodity_applicable_gender = commodity_applicable_gender;
	}

	public String getCommodity_applicable_location() {
		return commodity_applicable_location;
	}

	public void setCommodity_applicable_location(String commodity_applicable_location) {
		this.commodity_applicable_location = commodity_applicable_location;
	}

	public String getCommodity_signing_form() {
		return commodity_signing_form;
	}

	public void setCommodity_signing_form(String commodity_signing_form) {
		this.commodity_signing_form = commodity_signing_form;
	}

	public String getCommodity_liability_zjs() {
		return commodity_liability_zjs;
	}

	public void setCommodity_liability_zjs(String commodity_liability_zjs) {
		this.commodity_liability_zjs = commodity_liability_zjs;
	}

	public String getCommodity_detailed_information1() {
		return commodity_detailed_information1;
	}

	public void setCommodity_detailed_information1(String commodity_detailed_information1) {
		this.commodity_detailed_information1 = commodity_detailed_information1;
	}

	public String getCommodity_detailed_information2() {
		return commodity_detailed_information2;
	}

	public void setCommodity_detailed_information2(String commodity_detailed_information2) {
		this.commodity_detailed_information2 = commodity_detailed_information2;
	}

	public String getCommodity_detailed_information3() {
		return commodity_detailed_information3;
	}

	public void setCommodity_detailed_information3(String commodity_detailed_information3) {
		this.commodity_detailed_information3 = commodity_detailed_information3;
	}

	public String getCommodity_type() {
		return commodity_type;
	}

	public void setCommodity_type(String commodity_type) {
		this.commodity_type = commodity_type;
	}

	@Override
	public String toString() {
		return "Commodity [commodity_id=" + commodity_id + ", commodity_name=" + commodity_name + ", commodity_price="
				+ commodity_price + ", commodity_introduce=" + commodity_introduce + ", commodity_img=" + commodity_img
				+ ", commodity_age_start=" + commodity_age_start + ", commodity_age_end=" + commodity_age_end
				+ ", commodity_time_length=" + commodity_time_length + ", commodity_applicable_gender="
				+ commodity_applicable_gender + ", commodity_applicable_location=" + commodity_applicable_location
				+ ", commodity_signing_form=" + commodity_signing_form + ", commodity_liability_zjs="
				+ commodity_liability_zjs + ", commodity_detailed_information1=" + commodity_detailed_information1
				+ ", commodity_detailed_information2=" + commodity_detailed_information2
				+ ", commodity_detailed_information3=" + commodity_detailed_information3 + ", commodity_type="
				+ commodity_type + "]";
	}
}
