package com.genpact.insurance.model;

import java.util.Date;

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
	private String orderId;
	private String userId;
	private String paymentMode;
	private String wallets;
	private String upi;
	private String paymentGateway;
	private String bankName;
	private Double amount;
	private String transactionId;
	private String transactionStatus;
	private Date date;

}
