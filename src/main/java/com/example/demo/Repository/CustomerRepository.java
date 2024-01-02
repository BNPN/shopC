package com.example.demo.Repository;

import java.util.ArrayList;

import com.example.demo.Model.Customer;

public interface CustomerRepository {
	ArrayList<Customer> getCustomes();
	Customer getCustomer(int id);
	
	Customer updateCustomer();
	void deleteCustomer();
	Customer addCustomer(Customer customer);
	Customer getCustomer(Customer customer2);
	

}
