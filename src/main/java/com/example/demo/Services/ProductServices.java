package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductJpaRepository;
import com.example.demo.Repository.ProductRepository;
@Service
public class ProductServices implements ProductRepository{
	
	@Autowired
	private ProductJpaRepository pJP;
	
	@Override
	public ArrayList<Product> getProducts() {
		List<Product> product=pJP.findAll();
		ArrayList<Product> products=new ArrayList<>(product);
		return products;
	}

	@Override
	public Product getProduct(Product productid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addProduct(Product product) {
		pJP.save(product);
		return product;
	}

	@Override
	public Product updateProduct(Product productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Product Product) {
		// TODO Auto-generated method stub
		
	}

}
