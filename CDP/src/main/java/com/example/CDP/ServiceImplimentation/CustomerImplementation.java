package com.example.CDP.ServiceImplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CDP.CustomerRequest.CustomerRequest;
import com.example.CDP.Entity.Customer;
import com.example.CDP.Repository.CustomerRepository;
import com.example.CDP.ServiceInterface.CustomerInterface;

import jakarta.persistence.EntityNotFoundException;

@Service
public class CustomerImplementation implements CustomerInterface{
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(String customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerId).orElse(null);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer updateCustomer(String customerId, Customer updatedCustomer) {
		// TODO Auto-generated method stub
		 Customer existingCustomer = customerRepository.findById(customerId).orElse(null);
	        if (existingCustomer != null) {
	            existingCustomer.setCustomerName(updatedCustomer.getCustomerName());
	            existingCustomer.setDateOfBirth(updatedCustomer.getDateOfBirth());
	            existingCustomer.setGender(updatedCustomer.getGender());
	            existingCustomer.setPhoneNumber(updatedCustomer.getPhoneNumber());
	            return customerRepository.save(existingCustomer);
	        }
		return null;
	}

	@Override
	public void deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		 customerRepository.deleteById(customerId);
	}

	@Override
	public Customer updatetheCustomer(String customerId, Customer patchRequest) {
		// TODO Auto-generated method stub
		//return null;
		Customer existingCustomer = customerRepository.findById(customerId).orElseThrow(() -> new EntityNotFoundException("Customer not found with ID: " + customerId));

	    if (patchRequest.getCustomerName() != null) {
	        existingCustomer.setCustomerName(patchRequest.getCustomerName());
	    }

	    if (patchRequest.getGender() != 0 && existingCustomer.getGender() != patchRequest.getGender()) {
	        existingCustomer.setGender(patchRequest.getGender());
	    }
	    if (patchRequest.getDateOfBirth() != null) {
	        existingCustomer.setDateOfBirth(patchRequest.getDateOfBirth());
	    }

	    if (patchRequest.getPhoneNumber() != null) {
	        existingCustomer.setPhoneNumber(patchRequest.getPhoneNumber());
	    }
        // Optional: Handle other fields that can be updated

        return customerRepository.save(existingCustomer);
    }
	}

//	@Override
//	public Customer updatetheCustomer(String customerId, Customer updatedCustomer) {
//		// TODO Auto-generated method stub
//		 Customer existingCustomer = customerRepository.findById(customerId).orElse(null);
//	        if (existingCustomer != null) {
//	            existingCustomer.setCustomerName(updatedCustomer.getCustomerName());
//	            existingCustomer.setDateOfBirth(updatedCustomer.getDateOfBirth());
//	            existingCustomer.setGender(updatedCustomer.getGender());
//	            existingCustomer.setPhoneNumber(updatedCustomer.getPhoneNumber());
//	            return customerRepository.save(existingCustomer);
//	        }
//		return null;
//	}

