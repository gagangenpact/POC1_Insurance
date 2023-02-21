package com.genpact.insurance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Document("transactiondetails")
@Data
@Getter
@Setter
public class TransactionDetails {
	@Id
	private String transactionId;
	private String userId;
	private String bankName;
	private String paymentGateway;
	private String upi;
	private String wallets;
	private String paymentMode;
	private String paymentDetails;

}
