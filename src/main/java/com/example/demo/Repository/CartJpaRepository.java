package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Cart;

public interface CartJpaRepository extends JpaRepository<Cart,Integer>{


}
