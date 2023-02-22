package com.genpact.insurance.repository;

import com.genpact.insurance.model.Nominee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface NomineeRepo extends MongoRepository<Nominee, String> {

//    List<Nominee> findByUserId(String userId);



    @org.springframework.data.mongodb.repository.Query(value="{userId:'?0'}",  fields="{'firstName' : 1, 'middleName': 1,'lastName' : 1}")
    List<Nominee> findByUserId(String userId);
    public long count();


}

