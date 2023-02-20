package com.genpact.insurance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document("users")
@Data
@Getter
@Setter
public class User {
	@Id
	private String id;
	private String name;
	private String shortName;
	private String bloodGroup;
	
	public User(String name, String shortName, String bloodGroup ) {
		super();
		this.name = name;
		this.shortName = shortName;
		this.bloodGroup = bloodGroup;
	}

}
