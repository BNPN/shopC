package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Customer;

@Repository
public interface CustomerJpaRepository extends JpaRepository<Customer,Integer> {



	

}
