package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_insurance")
public class InsuranceDTO extends BaseDTO {

	@Column(name = "policy_holder_name", length = 50)
	private String policyHolderName;

	@Column(name = "policy_type", length = 50)
	private String policyType;

	@Column(name = "policy_amount")
	private Integer premiumAmount;

	@Column(name = "expiry_date")
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
	public String getValue() {
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "policyHolderName";
	}

	@Override
	public String getUniqueValue() {
		return policyHolderName;
	}

	@Override
	public String getLabel() {
		return "Policy Holder Name";
	}

	@Override
	public String getTableName() {
		return "Insurance";
	}

}
