package com.genpact.insurance.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.genpact.insurance.model.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	@Query("{name:'?0'}")
    User findUserByName(String name);
    
    @Query(value="{bloodGroup:'?0'}", fields="{'name' : 1, 'shortName' : 1}")
    List<User> findAll(String bloodGroup);
    
    public long count();

}
