package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Product;

public interface ProductJpaRepository extends JpaRepository<Product,Integer> {

}
