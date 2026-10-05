package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BranchDTO;

public class BranchForm extends BaseForm{
	
	@NotEmpty(message = "Branch Name is Required")
	private String branchName;
	
	@NotEmpty(message = "City is Required")
	private String city;
	
	@NotEmpty(message = "Manager Name is Required")
	private String managerName;
	
	@NotNull(message = "Contact No. is Required")
	@Pattern(regexp = "(^$|[0-9]{10})")
	private String contactNo;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	@Override
	public BaseDTO getDTO() {
		
		BranchDTO dto = initDTO(new BranchDTO());
		dto.setBranchName(branchName);
		dto.setCity(city);
		dto.setManagerName(managerName);
		dto.setContactNo(contactNo);
		
		return dto;
	}

}
