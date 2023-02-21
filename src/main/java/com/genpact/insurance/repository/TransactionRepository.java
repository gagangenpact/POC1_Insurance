package com.genpact.insurance.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.genpact.insurance.model.TransactionDetails;

public interface TransactionRepository extends MongoRepository<TransactionDetails, String> {

	List<TransactionDetails> findByUserId(String userId);

}
