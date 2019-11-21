package com.lti.entities;

import javax.persistence.*;

@Entity
public class Login {
	
	@Id
	private String l_user;
	private String l_type;
	private String l_password;
	public String getL_user() {
		return l_user;
	}
	public void setL_user(String l_user) {
		this.l_user = l_user;
	}
	public String getL_type() {
		return l_type;
	}
	public void setL_type(String l_type) {
		this.l_type = l_type;
	}
	public String getL_password() {
		return l_password;
	}
	public void setL_password(String l_password) {
		this.l_password = l_password;
	}
	
	
	

}
