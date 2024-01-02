package com.example.demo.Controllers;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Product;
import com.example.demo.Services.ProductServices;

@RestController
public class ProductController {
	@Autowired
	public ProductServices prodSer;
	
	@GetMapping("/products")
	public ArrayList<Product> getProduct(){
		return prodSer.getProducts();
	}
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return prodSer.addProduct(product);
	}

}
