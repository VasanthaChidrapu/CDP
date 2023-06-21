package com.example.CDP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CDP.CustomerRequest.CustomerRequest;
import com.example.CDP.Entity.Customer;
import com.example.CDP.ServiceInterface.CustomerInterface;

@RestController
@RequestMapping("/v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerInterface customerInterface;
	
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerInterface.createCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer);
    }
    
    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable String customerId) {
        return customerInterface.getCustomerById(customerId);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerInterface.getAllCustomers();
    }
    
    @PutMapping("/{customerId}")
    public Customer updateCustomer(@PathVariable String customerId, @RequestBody Customer updatedCustomer) {
        return customerInterface.updateCustomer(customerId, updatedCustomer);
    }
    

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable String customerId) {
    	customerInterface.deleteCustomer(customerId);
    }
    
//    @PatchMapping("/{customerId}")
//    public ResponseEntity<Customer> updateTheCustomer(
//            @PathVariable String customerId,
//            @RequestBody Customer updatedCustomer) {
//        Customer updated = customerInterface.updatetheCustomer(customerId, updatedCustomer);
//        return ResponseEntity.ok(updated);
//    }
    @PatchMapping("/{customerId}")
    public ResponseEntity<Customer> updateCustomerPatch(@PathVariable String customerId, @RequestBody Customer patchRequest) {
    	//Customer customer = customerInterface.getCustomerById(customerId);
    
        Customer updatedCustomer = customerInterface.updatetheCustomer(customerId, patchRequest);
        return ResponseEntity.ok(updatedCustomer);
    }


}
