package com.genpact.insurance.service;

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

    public Nominee insertNominee(Nominee nominee) {
        return nomineeRepo.save(nominee);
    }

}
