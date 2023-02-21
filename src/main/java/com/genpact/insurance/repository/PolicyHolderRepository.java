package com.genpact.insurance.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.genpact.insurance.model.PolicyHolder;

public interface PolicyHolderRepository extends MongoRepository<PolicyHolder, String> {

	PolicyHolder findByDependentId(String dependentId);

	List<PolicyHolder> findByHolderId(String holderId);

}
