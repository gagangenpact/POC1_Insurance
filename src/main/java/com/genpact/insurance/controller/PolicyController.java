package com.genpact.insurance.controller;

import com.genpact.insurance.model.Policy;
import com.genpact.insurance.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api")
public class PolicyController {

    @Autowired
    PolicyService policyService;

    @GetMapping("/policy")
    public ResponseEntity<List<Policy>> getPolicy() {
        List<Policy> policyList = policyService.allPolicyDetails();
        return new ResponseEntity<>(policyList, HttpStatus.OK);
    }

    @PostMapping("/policy")
    public ResponseEntity<List<Policy>> savePolicy(@RequestBody List<Policy> policies) {
        List<Policy> policyList = policyService.savePolicies(policies);
        return new ResponseEntity<>(policyList, HttpStatus.OK);
    }

    @PatchMapping("/policy/{polId}")
    public void updatePolicy(@PathVariable String polId, @RequestBody Policy polDetails) {
        policyService.updatePolDetails(polId, polDetails);
    }

}
