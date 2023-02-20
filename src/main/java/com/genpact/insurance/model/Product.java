package com.genpact.insurance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document("products")
@Data
@Getter
@Setter
public class Product {
	@Id
	private String id;
	private String provider;
	private String prdName;
	private String prdId;
	private String stDate;
	private String matDate;
	private String coverage; 
	private String isRiskProfiling;
	private String langSupported;
	private String prdShortName;
	private String isLife;
	private String prdType;
	
}

