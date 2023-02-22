package com.genpact.insurance.service;

import com.genpact.insurance.model.Policy;
import com.genpact.insurance.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PolicyService {

    @Autowired
    PolicyRepository policyRepository;

    public List<Policy> allPolicyDetails() {
        return policyRepository.findAll();
    }

    public List<Policy> savePolicies(List<Policy> policies) {
        return policyRepository.saveAll(policies);
    }

    public void updatePolDetails(String polId, Policy polDetails) {
        Optional<Policy> policyDetails = policyRepository.findById(polId);
        if (policyDetails.isPresent()) {
            Policy policy = policyDetails.get();
            if (polDetails.getInsuranceProvider() != null && !polDetails.getInsuranceProvider().isEmpty()) {
                policy.setInsuranceProvider(polDetails.getInsuranceProvider());
            }
            if (polDetails.getPolicySumAssured() != null) {
                policy.setPolicySumAssured(polDetails.getPolicySumAssured());
            }
            if (polDetails.getPremiumAmount() != null) {
                policy.setPremiumAmount(polDetails.getPremiumAmount());
            }
            if (polDetails.getPolicyHolder() != null && !polDetails.getPolicyHolder().isEmpty()) {
                policy.setPolicyHolder(polDetails.getPolicyHolder());
            }
            policyRepository.save(policy);
        }
    }
}
