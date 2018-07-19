package com.fund.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user")
public class userDetails {

	@Id
	@Column(name="user_id")
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int userId;

	@Column(name="user_name")
	private String userName;
	
	
	

	public userDetails() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
