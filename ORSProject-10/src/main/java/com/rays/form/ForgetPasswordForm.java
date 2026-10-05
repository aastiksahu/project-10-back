package com.rays.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseForm;

public class ForgetPasswordForm extends BaseForm{

	@NotEmpty(message = "Email Address is Required")
	@Email(message = "Please Enter Valid Email Address")
	private String loginId;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
}
