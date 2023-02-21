package com.genpact.insurance.service;

import com.genpact.insurance.Dto.NomineeDto;
import com.genpact.insurance.model.Nominee;
import com.genpact.insurance.repository.NomineeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NomineeService {
    @Autowired
    NomineeRepo nomineeRepo;


    public List<Nominee> displayNominees(String userId) {
        return nomineeRepo.findByUserId(userId);
    }

    public Nominee insertNominee(NomineeDto nominee) {
        return nomineeRepo.save(new Nominee(nominee.getFirstName(),nominee.getMiddleName(),nominee.getLastName(),nominee.getUserId(),nominee.getGuardianName(),nominee.getCurrentAddress(),nominee.getPermanentAddress(),nominee.getDob(),nominee.getGuardianPhone(),nominee.getGuardianAddress(),nominee.getGuardianAge()));

    }

}
