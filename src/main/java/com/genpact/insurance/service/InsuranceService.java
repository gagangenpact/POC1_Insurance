package com.genpact.insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.insurance.model.PolicyDetails;
import com.genpact.insurance.model.Product;
import com.genpact.insurance.repository.PolicyRepository;
import com.genpact.insurance.repository.ProductRepository;

@Service
public class InsuranceService {
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	PolicyRepository policyRepository;
	
	public List<Product> saveProducts(List<Product> products) {
		
		return productRepository.saveAll(products);
	}
	
	public List<Product> getProducts() {
		
		return productRepository.findAll();
	}

	public void savePolDetails(PolicyDetails polDetails) {
		policyRepository.save(polDetails);
	}

	public void updatePolDetails(String polId, PolicyDetails polDetails) {
		PolicyDetails policy = policyRepository.findById(polId).get();
		
		policy.setInsuranceProvider(polDetails.getInsuranceProvider());
		policy.setPolSumAssured(polDetails.getPolSumAssured());
		policy.setPremiumAmt(polDetails.getPremiumAmt());
		policy.setPolicyHolder(polDetails.getPolicyHolder());	
		
		policyRepository.save(policy);
		
	}
}
