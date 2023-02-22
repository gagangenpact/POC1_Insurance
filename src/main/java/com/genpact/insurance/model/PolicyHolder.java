package com.genpact.insurance.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document("policyholders")
@Data
@Getter
@Setter
public class PolicyHolder {
	
	@Id
	private String holderId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String bloodGroup;
	private int age;
	private String currentAddress;
	private String permanentAddress;	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date dob;
	private String phoneNumber;
	private String idProof;
	private String policyId;
	private String userId;
	private String userRelation;
	

}
