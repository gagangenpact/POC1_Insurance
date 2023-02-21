package com.genpact.insurance.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.genpact.insurance.model.PolicyDetails;

public interface PolicyRepository extends MongoRepository<PolicyDetails, String> {
		
}
