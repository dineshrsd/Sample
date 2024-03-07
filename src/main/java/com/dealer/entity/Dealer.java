package com.dealer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dealer")
public class Dealer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String name;
	private int rating;
	private String product;

	public int getDid() {
		return did;
	}

	public String getName() {
		return name;
	}

	public int getRating() {
		return rating;
	}

	public String getProduct() {
		return product;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setProduct(String product) {
		this.product = product;
	}

}
