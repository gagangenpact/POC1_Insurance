package com.genpact.insurance.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.genpact.insurance.model.TransactionDetails;

public interface TransactionRepository extends MongoRepository<TransactionDetails, String> {

	@Query("{userId:'?0'}")
	List<TransactionDetails> findByUserId(String userId);

    public long count();

}
