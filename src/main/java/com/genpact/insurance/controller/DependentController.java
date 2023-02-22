package com.genpact.insurance.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public ResponseEntity<List<PolicyHolder>> getPolicyHolder(@RequestParam String userId) {
		List<PolicyHolder> policyHolder = new ArrayList<>();
		try {
			policyHolder = policyHolderService.getPolicyHolderInfo(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<List<PolicyHolder>>(policyHolder, HttpStatus.OK);
	}

	@PatchMapping("/dependents")
    public ResponseEntity<PolicyHolder> updatePolicyHolder(@RequestParam String holderId,
            @RequestBody PolicyHolder policyHolderInfo) {		
		PolicyHolder policyHolder= policyHolderService.updatePolicyHolderInfo(holderId, policyHolderInfo);
		return new ResponseEntity<PolicyHolder>(policyHolder,HttpStatus.OK);
	}

}
