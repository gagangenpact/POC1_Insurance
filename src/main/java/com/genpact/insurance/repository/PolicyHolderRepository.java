package com.genpact.insurance.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.genpact.insurance.model.PolicyHolder;

public interface PolicyHolderRepository extends MongoRepository<PolicyHolder, String> {

	@Query("{userId:'?0'}")
	List<PolicyHolder> findByUserId(String userId);


	
    public long count();

}
