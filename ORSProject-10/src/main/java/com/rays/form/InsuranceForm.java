package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.InsuranceDTO;

public class InsuranceForm extends BaseForm {

	@NotEmpty(message = "Policy Holder Name is Required")
	private String policyHolderName;

	@NotEmpty(message = "Policy Type is Required")
	private String policyType;

	@NotNull(message = "Premium Amount is Required")
	@Min(0)
	private Integer premiumAmount;

	@NotNull(message = "Expiry Date is Required")
	private Date expiryDate;

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Integer getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(Integer premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public BaseDTO getDTO() {
		
		InsuranceDTO dto = initDTO(new InsuranceDTO());
		dto.setPolicyHolderName(policyHolderName);
		dto.setPolicyType(policyType);
		dto.setPremiumAmount(premiumAmount);
		dto.setExpiryDate(expiryDate);
		
		return dto;
	}
}
