package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Customer;
import com.example.demo.Repository.CustomerJpaRepository;
import com.example.demo.Repository.CustomerRepository;
@Service
public class CustomerServices implements CustomerRepository {
	
	@Autowired
	private CustomerJpaRepository cJP;

	@Override
	public ArrayList<Customer> getCustomes() {
		List<Customer> customer=cJP.findAll();
		ArrayList<Customer> customers=new ArrayList<>(customer);
		return customers;
	}

	@Override
	public Customer getCustomer(int id) {
		Customer customer=cJP.findById(id).get();
			return customer;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		cJP.save(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer() {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomer(Customer customer2) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
