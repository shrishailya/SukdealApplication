package com.model;

public class AuthResponse {
	private String userName;
	private String role;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public AuthResponse(String userName, String role) {
		this.userName = userName;
		this.role = role;
	}	

}
