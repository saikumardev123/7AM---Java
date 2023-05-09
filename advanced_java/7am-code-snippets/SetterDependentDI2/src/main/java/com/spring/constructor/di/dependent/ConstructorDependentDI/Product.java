package com.spring.constructor.di.dependent.ConstructorDependentDI;

public class Product {
	
	private int productId;
	private String name;
	private int price;
	private Seller seller;
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public int getProductId() {
		return productId;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public Seller getSeller() {
		return seller;
	}
	
}
