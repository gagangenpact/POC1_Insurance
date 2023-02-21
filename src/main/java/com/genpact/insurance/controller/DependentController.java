package com.genpact.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.insurance.model.PolicyHolder;
import com.genpact.insurance.service.PolicyHolderService;

@RestController
@RequestMapping(value = "/rest/api")
public class DependentController {
	
	@Autowired
	PolicyHolderService policyHolderService;
	
	@PostMapping("/dependents")
    public ResponseEntity<PolicyHolder> savePolicyHolder(@RequestBody PolicyHolder policyHolder) {		
		policyHolder = policyHolderService.savePolicyHolderInfo(policyHolder);
		return new ResponseEntity<PolicyHolder>(policyHolder, HttpStatus.CREATED);
	}
	

	@GetMapping("/dependents")
	public ResponseEntity<PolicyHolder> getPolicyHolder(@RequestParam String dependentId) {
		PolicyHolder policyHolder = new PolicyHolder();
		try {
			policyHolder = policyHolderService.getPolicyHolderInfo(dependentId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<PolicyHolder>(policyHolder, HttpStatus.OK);
	}

	@PutMapping("/dependents")
    public ResponseEntity<PolicyHolder> updatePolicyHolder(@RequestParam String dependentId,
            @RequestBody PolicyHolder policyHolderInfo) {		
		PolicyHolder policyHolder= policyHolderService.updatePolicyHolderInfo(dependentId, policyHolderInfo);
		return new ResponseEntity<PolicyHolder>(policyHolder,HttpStatus.OK);
	}

}
