package com.constant;

public enum UserRole {
	MEMBER,
	ADMIN;
	
	public static UserRole role(String role) {
		for(UserRole ur: UserRole.values()) {
			if(ur.name().equalsIgnoreCase(role.trim())) return ur;
		}
		return UserRole.MEMBER;
	}
}
