package com.nt.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable {
	private int productId;
	private String productName;
	private int quantity;

	public ProductDTO() {
		super();
		System.out.println("ProductBO 0-param Constructor");
	}

	public ProductDTO(int productId, String productName, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
