package com.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.constant.UserRole;

@Document(collection = "user")
public class User {
	@Id private String id;
	@Indexed(unique = true) private String username;
	private String password;
	private UserRole role;
	private String emailId; 
	@CreatedDate private Date created;
	@LastModifiedDate private Date modified;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	
	public User(String username, UserRole role, String emailId) {
		super();
		this.username = username;
		this.role = role;
		this.emailId = emailId;
	}
	
	public User(String id, String username, String password, UserRole role, String emailId, Date created,
			Date modified) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.emailId = emailId;
		this.created = created;
		this.modified = modified;
	}
	
	
}
