package com.example.demo.Repository;

import java.util.ArrayList;

import com.example.demo.Model.Product;

public interface ProductRepository {
	ArrayList<Product> getProducts();
	Product getProduct(Product productid);
	Product addProduct(Product product);
	Product updateProduct(Product productId);
	void deleteProduct(Product Product);
}
