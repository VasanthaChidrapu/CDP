package com.example.CDP.CustomerRequest;

import java.sql.Date;

import jakarta.persistence.Column;

public class CustomerRequest {
	
	private String customerId;
	
	private String customerName;
	
	private Date dateOfBirth;
	
    @Column(nullable=false)
	private char gender;
	
	private String phoneNumber;

	public CustomerRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerRequest(String customerId, String customerName, Date dateOfBirth, char gender, String phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "CustomerRequest [customerId=" + customerId + ", customerName=" + customerName + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
