package com.genpact.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.insurance.model.PolicyHolder;
import com.genpact.insurance.repository.PolicyHolderRepository;

@Service
public class PolicyHolderService {

	@Autowired
	PolicyHolderRepository policyHolderRepository;

	public PolicyHolder savePolicyHolderInfo(PolicyHolder policyHolder) {
		return policyHolderRepository.save(policyHolder);
	}

	public List<PolicyHolder> getPolicyHolders() {
		return policyHolderRepository.findAll();
	}

	public List<PolicyHolder> getPolicyHolderInfo(String userId) {
		return policyHolderRepository.findByUserId(userId);
	}

	public PolicyHolder updatePolicyHolderInfo(String holderId, PolicyHolder policyHolderInfo) {

		if (policyHolderRepository.findById(holderId).isPresent()) {
			PolicyHolder existingRecord = policyHolderRepository.findById(holderId).get();
			existingRecord.setAge(policyHolderInfo.getAge());
			existingRecord.setBloodGroup(policyHolderInfo.getBloodGroup());
			existingRecord.setCurrentAddress(policyHolderInfo.getCurrentAddress());
			existingRecord.setDob(policyHolderInfo.getDob());
			existingRecord.setIdProof(policyHolderInfo.getIdProof());
			existingRecord.setUserRelation(policyHolderInfo.getUserRelation());
			existingRecord.setPermanentAddress(policyHolderInfo.getPermanentAddress());
			existingRecord.setPhoneNumber(policyHolderInfo.getPhoneNumber());
			existingRecord.setUserId(policyHolderInfo.getUserId());
			existingRecord.setPolicyId(policyHolderInfo.getPolicyId());
			existingRecord.setFirstName(policyHolderInfo.getFirstName());
			existingRecord.setLastName(policyHolderInfo.getLastName());
			existingRecord.setMiddleName(policyHolderInfo.getMiddleName());

			return policyHolderRepository.save(existingRecord);
		} else {
			return null;
		}
	}

}
