package com.example.medicare.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String manufactureBy;
	
	private String consumeType;
	
	private String price;
	
	private String imageURL;

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicine(int id, String name, String manufactureBy, String consumeType, String price, String imageURL) {
		super();
		this.id = id;
		this.name = name;
		this.manufactureBy = manufactureBy;
		this.consumeType = consumeType;
		this.price = price;
		this.imageURL = imageURL;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufactureBy() {
		return manufactureBy;
	}

	public void setManufactureBy(String manufactureBy) {
		this.manufactureBy = manufactureBy;
	}

	public String getConsumeType() {
		return consumeType;
	}

	public void setConsumeType(String consumeType) {
		this.consumeType = consumeType;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", manufactureBy=" + manufactureBy + ", consumeType=" + consumeType
				+ ", price=" + price + ", imageURL=" + imageURL + "]";
	}
	
	
	

}
