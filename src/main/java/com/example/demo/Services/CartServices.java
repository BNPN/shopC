package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Cart;
import com.example.demo.Repository.CartJpaRepository;
import com.example.demo.Repository.CartRepository;

@Service
public class CartServices implements CartRepository{
	
	@Autowired
	private CartJpaRepository cartJP;

	@Override
	public ArrayList<Cart> getProducts() {
		List<Cart> product=cartJP.findAll();
		ArrayList<Cart> products=new ArrayList<>(product);
		return products;
	}

	@Override
	public Cart getProduct(Cart productid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart addProduct(Cart product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cart updateProduct(Cart productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Cart Product) {
		// TODO Auto-generated method stub
		
	}

	

	

}
