package com.tcs.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id    
	@Column(name="id")
	private String id;
	
	private String version;
	private String name;
	private String price;
	private String product_id;
	
	public Product(){
		
	}

	public Product(String id, String version, String name, String price, String product_id) {
		super();
		this.id = id;
		this.version = version;
		this.name = name;
		this.price = price;
		this.product_id = product_id;
	}

	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	

	
}
