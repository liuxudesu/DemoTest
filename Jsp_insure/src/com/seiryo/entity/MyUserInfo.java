package com.seiryo.entity;

public class MyUserInfo extends MyUser{
	
	private Integer user_info_id;
	
	private String user_phone;
	
	private String user_money;
	
	private String user_name;
	
	private String user_birthday;
	
	private String user_sex;
	
	private Integer user_status;

	public MyUserInfo(Integer user_id, String user_email, String user_password, Integer user_info_id,
			String user_phone, String user_money, String user_name, String user_birthday, String user_sex,
			Integer user_status) {
		super(user_id, user_email, user_password);
		this.user_info_id = user_info_id;
		this.user_phone = user_phone;
		this.user_money = user_money;
		this.user_name = user_name;
		this.user_birthday = user_birthday;
		this.user_sex = user_sex;
		this.user_status = user_status;
	}

	public MyUserInfo(Integer user_id, String user_email, String user_password) {
		super(user_id, user_email, user_password);
	}

	public Integer getUser_info_id() {
		return user_info_id;
	}

	public void setUser_info_id(Integer user_info_id) {
		this.user_info_id = user_info_id;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_money() {
		return user_money;
	}

	public void setUser_money(String user_money) {
		this.user_money = user_money;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_birthday() {
		return user_birthday;
	}

	public void setUser_birthday(String user_birthday) {
		this.user_birthday = user_birthday;
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public Integer getUser_status() {
		return user_status;
	}

	public void setUser_status(Integer user_status) {
		this.user_status = user_status;
	}

	@Override
	public String toString() {
		return "MyUserInfo [user_info_id=" + user_info_id + ", user_phone=" + user_phone
				+ ", user_money=" + user_money + ", user_name=" + user_name + ", user_birthday=" + user_birthday
				+ ", user_sex=" + user_sex + ", user_status=" + user_status + "]";
	}

}
