package com.example.demo.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.Cart;

import com.example.demo.Services.CartServices;


public class CartController {
	@Autowired
	public CartServices prodSer;
	
	@GetMapping("/cart/products")
	public ArrayList<Cart> getProduct(){
		return prodSer.getProducts();
	}
	@PostMapping("/cart/products")
	public Cart addProduct(@RequestBody Cart product) {
		return prodSer.addProduct(product);
	}
	
}
