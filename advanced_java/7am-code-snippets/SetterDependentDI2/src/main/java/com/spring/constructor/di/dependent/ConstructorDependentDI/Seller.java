package com.spring.constructor.di.dependent.ConstructorDependentDI;

public class Seller {
	 private String sellerName;
	 private String address;
	
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSellerName() {
		return sellerName;
	}
	public String getAddress() {
		return address;
	}
}
