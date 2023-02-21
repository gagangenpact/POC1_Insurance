package com.genpact.insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.insurance.model.PolicyHolder;
import com.genpact.insurance.repository.PolicyHolderRepository;

@Service
public class PolicyHolderService {

	@Autowired
	PolicyHolderRepository nomineeRepository;

	public PolicyHolder savePolicyHolderInfo(PolicyHolder policyHolder) {
		return nomineeRepository.save(policyHolder);
	}

	public List<PolicyHolder> getPolicyHolders() {
		return nomineeRepository.findAll();
	}
	
	public PolicyHolder getPolicyHolderInfo(String dependentId) {
		return nomineeRepository.findByDependentId(dependentId);
	}

	
	public List<PolicyHolder> getNominees(String holderId) {
		return nomineeRepository.findByHolderId(holderId);
	}
	
	public PolicyHolder updatePolicyHolderInfo(String dependentId, PolicyHolder policyHolderInfo) {
		
		Optional<PolicyHolder> policyHolder = nomineeRepository.findById(dependentId);
		if(policyHolder.isPresent()) {
			nomineeRepository.save(policyHolderInfo);
		}
		
		return policyHolderInfo;
	}

}
