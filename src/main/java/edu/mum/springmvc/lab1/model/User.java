package edu.mum.springmvc.lab1.model;

public class User {
	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", password=" + password + "]";
	}

	private String user_name;

	public User() {

	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;
}
