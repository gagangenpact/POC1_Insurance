package com.genpact.insurance.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document("policies")
@Data
@NoArgsConstructor
public class PolicyDetails {
	@Id
	private String polId;
	private int polNumber;
	private String insuranceProvider;
	private String polName;
	private Date polStDt;
	private Date polEndDt;
	private int polSumAssured;
	private int premiumAmt;
	private String nominee;
	private String policyHolder;
	private String nomineePercent;
	private String polType;
	private int productId;
}
