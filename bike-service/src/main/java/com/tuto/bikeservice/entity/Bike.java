package com.tuto.bikeservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="bikes")
public class Bike {
	
	@Id
	private int id;
	@Column(name = "brand",length = 50)
	private String brand;
	@Column(name = "model",length = 50)
	private String model;
	
	@Column(name = "userId",length = 9)
	private int userId;
	
	public Bike() {
	
	}
	
	public Bike(int id, String brand, String model) {
		
		this.id = id;
		this.brand = brand;
		this.model = model;
	}

	
	public Bike(int id, String brand, String model, int userId) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getModel() {
		return model;
	}
	
	
	
}
