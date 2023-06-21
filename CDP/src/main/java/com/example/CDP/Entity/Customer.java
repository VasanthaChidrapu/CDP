package com.example.CDP.Entity;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Transient;
@Entity
public class Customer {
	@Id
	private String customerId;
	
//	   @Transient
//	    private String customId;
//	   
//	   @PrePersist
//	    private void generateCustomId() {
//	        if (customerId != null) {
//	            customId = "cust" + customerId.substring(3);
//	        }
//	    }
	
	public Customer() {
//        this.customerId = UUID.randomUUID().toString();
   }

	private String customerName;
	
	private Date dateOfBirth;
	
    @Column(nullable=false)
	private char gender;
	
	private String phoneNumber;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer")
    private List<Document> documents;
	
//	public Customer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Customer(String customerId, String customerName, Date dateOfBirth, char gender, String phoneNumber,
			List<Document> documents) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.documents = documents;
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

	public List<Document> getDocuments() {
		return documents;
	}



	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", documents=" + documents + "]";
	}
	
	
	
}
