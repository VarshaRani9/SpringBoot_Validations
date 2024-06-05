package com.xyz.practice.entities;

import javax.validation.constraints.NotBlank;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {

	@NotBlank(message="User Name cannot be empty!!")
	@Size(min=3,max=12,message="User name must be between 3-12 characters")
	private String userName;
	
	@Pattern(regexp="^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$", message="Invalid email")
	private String email;
	
	@AssertTrue(message="must agree terms and conditions")
	public boolean agreed;
	
	public String getUserName() {
		return userName;
	}
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	
}
