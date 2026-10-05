package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class MyProfileForm {

	@NotEmpty(message = "First Name is Required")
	private String firstName;

	@NotEmpty(message = "Last Name is Required")
	private String lastName;

	@NotEmpty(message = "Login Id is Required")
	private String loginId;

	@NotEmpty(message = "Gender is Required")
	private String gender;

	@NotEmpty(message = "Mobile Number is Required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String phone;

	@NotEmpty(message = "Alternate Mobile No. is Required")
	private String alternateMobile;

	@NotNull(message = "Date of Birth is Required")
	private Date dob;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAlternateMobile() {
		return alternateMobile;
	}

	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}
