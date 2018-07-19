package com.nt.command;

public class ProductSearchCommand {

	private int productId;
	private String productName;
	private int quantity;

	public ProductSearchCommand() {
		System.out.println("ProductSearchCommand 0-param Constructor");
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

	@Override
	public String toString() {
		return "ProductSearchCommand [productId=" + productId + ", productName=" + productName + ", quantity="
				+ quantity + "]";
	}


}
