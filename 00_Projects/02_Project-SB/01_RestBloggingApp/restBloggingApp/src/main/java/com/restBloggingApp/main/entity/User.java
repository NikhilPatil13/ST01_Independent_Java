package com.restBloggingApp.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userIdentifier;
	
	private String name;
	private String emailId;
	private String password;
	private String about;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer userIdentifier, String name, String emailId, String password, String about) {
		super();
		this.userIdentifier = userIdentifier;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
		this.about = about;
	}
	public Integer getUserIdentifier() {
		return userIdentifier;
	}
	public void setUserIdentifier(Integer userIdentifier) {
		this.userIdentifier = userIdentifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	@Override
	public String toString() {
		return "User [userIdentifier=" + userIdentifier + ", name=" + name + ", emailId=" + emailId + ", password="
				+ password + ", about=" + about + "]";
	}
	
}
