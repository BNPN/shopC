package com.example.demo.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.Services.CustomerServices;


@RestController
public class CustomerController {
	@Autowired
	 public CustomerServices customerSeervices;
	
	@GetMapping("/customers")
    public ArrayList<Customer> getCustomers(){
        return customerSeervices.getCustomes();
    }
	@GetMapping("/customer/{customerId}")
    public Customer getCustomer(@PathVariable Customer customerId ){
        return customerSeervices.getCustomer(customerId);
    }
	@PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerSeervices.addCustomer(customer);
    }
	

}
