package com.cdkglobal.model;

public class Customer {
	
	private Long customerId;
	private String customerName;
	private CustomerType customerType;
	
	public Customer(Long customerId, String customerName, CustomerType customerType) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerType = customerType;
	}
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public CustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}
	
	

}
