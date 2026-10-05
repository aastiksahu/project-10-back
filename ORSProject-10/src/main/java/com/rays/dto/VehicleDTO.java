package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_vehicle")
public class VehicleDTO extends BaseDTO {

	@Column(name = "vehicle_name", length = 50)
	private String vehicleName;

	@Column(name = "model", length = 50)
	private String model;

	@Column(name = "color", length = 50)
	private String color;

	@Column(name = "price")
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
	public String getValue() {
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "vehicleName";
	}

	@Override
	public String getUniqueValue() {
		return vehicleName;
	}

	@Override
	public String getLabel() {
		return "Vehicle Name";
	}

	@Override
	public String getTableName() {
		return "Vehicle";
	}

}
