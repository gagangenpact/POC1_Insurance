package com.genpact.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.insurance.model.PolicyDetails;
import com.genpact.insurance.service.InsuranceService;

@RestController
@RequestMapping("/rest/api")
public class PolicyController {

	@Autowired
	InsuranceService insuranceService;
	
	@PostMapping("/policy")
	public void createPolicy(@RequestBody PolicyDetails polDetails) {
		insuranceService.savePolDetails(polDetails);		
	}
	
	@PatchMapping("/policy/{polId}")
	public void updatePolicy(@PathVariable String polId, @RequestBody PolicyDetails polDetails) {
		insuranceService.updatePolDetails(polId, polDetails);		
	}
}
