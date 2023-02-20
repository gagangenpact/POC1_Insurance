package com.genpact.insurance.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.genpact.insurance.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
	
	@Query("{prdName:'?0'}")
    Product findUserByName(String prdName);
    
	/*
	 * @Query(value="{bloodGroup:'?0'}", fields="{'prdName' : 1, 'stDate' : 1}")
	 * List<Product> findAll(String prdType);
	 */
    
    public long count();

}
