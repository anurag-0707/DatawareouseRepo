package com.nt.bo;

import java.util.Date;

public class ProductResultBO {
	private int productId;
	private String productName;
	private float productPrice;
	private int productQuantity;
	private Date productManufacturedDate;
	private Date productExpiryDate;

	public ProductResultBO() {
		super();
		System.out.println("ProductResultBO 0-param Constructor");
	}

	public ProductResultBO(int productId, String productName, float productPrice, int productQuantity,
			Date productManufacturedDate, Date productExpiryDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productManufacturedDate = productManufacturedDate;
		this.productExpiryDate = productExpiryDate;
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

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Date getProductManufacturedDate() {
		return productManufacturedDate;
	}

	public void setProductManufacturedDate(Date productManufacturedDate) {
		this.productManufacturedDate = productManufacturedDate;
	}

	public Date getProductExpiryDate() {
		return productExpiryDate;
	}

	public void setProductExpiryDate(Date productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
	}

}
