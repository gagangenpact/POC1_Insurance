package com.genpact.insurance.controller;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.insurance.model.Product;
import com.genpact.insurance.service.InsuranceService;

@RestController
@RequestMapping(value = "/rest/api")
public class ProductController {
	
	@Autowired
	InsuranceService insuranceService;
	
	@PostMapping("/products")
    public ResponseEntity<List<Product>> saveProducts(@RequestBody List<Product> products) {
		
		insuranceService.saveProducts(products);
		return new ResponseEntity<List<Product>>(products, HttpStatus.CREATED);
	}
	
	@GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
		
		List<Product> products = insuranceService.getProducts();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
    

}
