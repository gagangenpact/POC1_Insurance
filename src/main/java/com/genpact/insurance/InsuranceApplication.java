package com.genpact.insurance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.genpact.insurance.model.User;
import com.genpact.insurance.repository.UserRepository;

@SpringBootApplication
@EnableMongoRepositories
/*public class InsuranceApplication implements CommandLineRunner{
    
    @Autowired
    UserRepository userRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(InsuranceApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		userRepository.save(new User("Gagan Kumar", "gkumar", "O+ve"));
		userRepository.save(new User("Michel", "michel", "AB+ve"));
		
	}
}*/

public class InsuranceApplication{
    
    public static void main(String[] args) {
        SpringApplication.run(InsuranceApplication.class, args);
    }
}