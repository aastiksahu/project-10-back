package com.rays.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class LoginForm {
	
	@NotEmpty(message = "Login Id is Required")
	@Email
	private String loginId;
	
	@NotEmpty(message = "Password is Required")
	private String password;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
