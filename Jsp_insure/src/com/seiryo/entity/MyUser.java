package com.seiryo.entity;

public class MyUser {
	
	private Integer user_id;
	
	private String user_email;
	
	private String user_password;

	public MyUser(Integer user_id, String user_email, String user_password) {
		super();
		this.user_id = user_id;
		this.user_email = user_email;
		this.user_password = user_password;
	}

	public MyUser() {
		super();
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Override
	public String toString() {
		return "My_user [user_id=" + user_id + ", user_email=" + user_email + ", user_password=" + user_password + "]";
	}

}
