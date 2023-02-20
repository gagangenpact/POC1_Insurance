package com.genpact.insurance.service;

import com.genpact.insurance.model.Policy;
import com.genpact.insurance.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    @Autowired
    PolicyRepository policyRepository;

    public List<Policy> allPolicyDetails() {
        return policyRepository.findAll();
    }

}
