package com.seiryo.entity;

public class Commodity_liability_info extends Commodity{
	
	private Integer commodity_liability_info_id;
	
	private String commodity_liability_info1;
	
	private String commodity_liability_info2;
	
	private String commodity_liability_info3;
	
	private String commodity_liability_info4;
	
	private String commodity_liability_info5;
	
	private String commodity_liability_info6;
	
	private String commodity_liability_info7;

	public Commodity_liability_info(Integer commodity_id, String commodity_name, String commodity_price,
			String commodity_introduce, String commodity_img, Integer commodity_age_start, Integer commodity_age_end,
			String commodity_time_length, Integer commodity_applicable_gender, String commodity_applicable_location,
			String commodity_signing_form, String commodity_liability_zjs, String commodity_detailed_information1,
			String commodity_detailed_information2, String commodity_detailed_information3, String commodity_type,
			Integer commodity_liability_info_id, String commodity_liability_info1, String commodity_liability_info2,
			String commodity_liability_info3, String commodity_liability_info4, String commodity_liability_info5,
			String commodity_liability_info6, String commodity_liability_info7) {
		super(commodity_id, commodity_name, commodity_price, commodity_introduce, commodity_img, commodity_age_start,
				commodity_age_end, commodity_time_length, commodity_applicable_gender, commodity_applicable_location,
				commodity_signing_form, commodity_liability_zjs, commodity_detailed_information1,
				commodity_detailed_information2, commodity_detailed_information3, commodity_type);
		this.commodity_liability_info_id = commodity_liability_info_id;
		this.commodity_liability_info1 = commodity_liability_info1;
		this.commodity_liability_info2 = commodity_liability_info2;
		this.commodity_liability_info3 = commodity_liability_info3;
		this.commodity_liability_info4 = commodity_liability_info4;
		this.commodity_liability_info5 = commodity_liability_info5;
		this.commodity_liability_info6 = commodity_liability_info6;
		this.commodity_liability_info7 = commodity_liability_info7;
	}

	public Commodity_liability_info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commodity_liability_info(Integer commodity_id, String commodity_name, String commodity_price,
			String commodity_introduce, String commodity_img, Integer commodity_age_start, Integer commodity_age_end,
			String commodity_time_length, Integer commodity_applicable_gender, String commodity_applicable_location,
			String commodity_signing_form, String commodity_liability_zjs, String commodity_detailed_information1,
			String commodity_detailed_information2, String commodity_detailed_information3, String commodity_type) {
		super(commodity_id, commodity_name, commodity_price, commodity_introduce, commodity_img, commodity_age_start,
				commodity_age_end, commodity_time_length, commodity_applicable_gender, commodity_applicable_location,
				commodity_signing_form, commodity_liability_zjs, commodity_detailed_information1,
				commodity_detailed_information2, commodity_detailed_information3, commodity_type);
		// TODO Auto-generated constructor stub
	}



	public Integer getCommodity_liability_info_id() {
		return commodity_liability_info_id;
	}

	public void setCommodity_liability_info_id(Integer commodity_liability_info_id) {
		this.commodity_liability_info_id = commodity_liability_info_id;
	}

	public String getCommodity_liability_info1() {
		return commodity_liability_info1;
	}

	public void setCommodity_liability_info1(String commodity_liability_info1) {
		this.commodity_liability_info1 = commodity_liability_info1;
	}

	public String getCommodity_liability_info2() {
		return commodity_liability_info2;
	}

	public void setCommodity_liability_info2(String commodity_liability_info2) {
		this.commodity_liability_info2 = commodity_liability_info2;
	}

	public String getCommodity_liability_info3() {
		return commodity_liability_info3;
	}

	public void setCommodity_liability_info3(String commodity_liability_info3) {
		this.commodity_liability_info3 = commodity_liability_info3;
	}

	public String getCommodity_liability_info4() {
		return commodity_liability_info4;
	}

	public void setCommodity_liability_info4(String commodity_liability_info4) {
		this.commodity_liability_info4 = commodity_liability_info4;
	}

	public String getCommodity_liability_info5() {
		return commodity_liability_info5;
	}

	public void setCommodity_liability_info5(String commodity_liability_info5) {
		this.commodity_liability_info5 = commodity_liability_info5;
	}

	public String getCommodity_liability_info6() {
		return commodity_liability_info6;
	}

	public void setCommodity_liability_info6(String commodity_liability_info6) {
		this.commodity_liability_info6 = commodity_liability_info6;
	}

	public String getCommodity_liability_info7() {
		return commodity_liability_info7;
	}

	public void setCommodity_liability_info7(String commodity_liability_info7) {
		this.commodity_liability_info7 = commodity_liability_info7;
	}

	@Override
	public String toString() {
		return "Commodity_liability_info [commodity_liability_info_id=" + commodity_liability_info_id
				+ ", commodity_liability_info1=" + commodity_liability_info1 + ", commodity_liability_info2="
				+ commodity_liability_info2 + ", commodity_liability_info3=" + commodity_liability_info3
				+ ", commodity_liability_info4=" + commodity_liability_info4 + ", commodity_liability_info5="
				+ commodity_liability_info5 + ", commodity_liability_info6=" + commodity_liability_info6
				+ ", commodity_liability_info7=" + commodity_liability_info7 + "]";
	}

}
