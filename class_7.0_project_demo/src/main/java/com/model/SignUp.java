package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SignUp {

	
	private String fullname;
	@Id
	private String email;
	private String pwd;
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
