package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VehicleDTO;

public class VehicleForm extends BaseForm {

	@NotEmpty(message = "Vehicle Name is Required")
	private String vehicleName;

	@NotEmpty(message = "Model is Required")
	private String model;

	@NotEmpty(message = "Color is Required")
	private String color;

	@Min(1)
	@NotNull(message = "Price is Required")
	private Double price;

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public BaseDTO getDTO() {
		
		VehicleDTO dto = initDTO(new VehicleDTO());
		dto.setVehicleName(vehicleName);
		dto.setModel(model);
		dto.setColor(color);
		dto.setPrice(price);
		
		return dto;
	}

}
