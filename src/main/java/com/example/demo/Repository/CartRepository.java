package com.example.demo.Repository;

import java.util.ArrayList;

import com.example.demo.Model.Cart;

public interface CartRepository {
	ArrayList<Cart> getProducts();
	Cart getProduct(Cart productid);
	Cart addProduct(Cart product);
	Cart updateProduct(Cart productId);
	void deleteProduct(Cart Product);

}
