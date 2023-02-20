package com.genpact.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.insurance.model.Product;
import com.genpact.insurance.repository.ProductRepository;

@Service
public class InsuranceService {
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> saveProducts(List<Product> products) {
		
		return productRepository.saveAll(products);
	}
	
	public List<Product> getProducts() {
		
		return productRepository.findAll();
	}

}
