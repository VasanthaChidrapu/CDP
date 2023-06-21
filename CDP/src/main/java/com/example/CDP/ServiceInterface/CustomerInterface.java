package com.example.CDP.ServiceInterface;

import java.util.List;

import com.example.CDP.CustomerRequest.CustomerRequest;
import com.example.CDP.Entity.Customer;

public interface CustomerInterface {

	Customer createCustomer(Customer customer);

	Customer getCustomerById(String customerId);

	List<Customer> getAllCustomers();

	Customer updateCustomer(String customerId, Customer updatedCustomer);

	void deleteCustomer(String customerId);

	Customer updatetheCustomer(String customerId, Customer patchRequest);

}
