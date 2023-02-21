package com.genpact.insurance.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.insurance.model.TransactionDetails;
import com.genpact.insurance.service.TransactionService;

@RestController
@RequestMapping(value = "/rest/api")
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	@PostMapping("/transactions")
	public ResponseEntity<TransactionDetails> saveTransaction(@RequestBody TransactionDetails transaction) {
		transactionService.saveTransaction(transaction);
		return new ResponseEntity<TransactionDetails>(transaction, HttpStatus.CREATED);
	}

	@GetMapping("/transactions")
	public ResponseEntity<List<TransactionDetails>> getTransactions(@RequestParam String userId) {
		List<TransactionDetails> transactions = new ArrayList<>();
		try {
			transactions = transactionService.getTransactions(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<List<TransactionDetails>>(transactions, HttpStatus.OK);
	}

	@PutMapping("/transactions")
	public ResponseEntity<TransactionDetails> updateTransactions(@RequestParam String transactionId, @RequestBody TransactionDetails transaction) {
		TransactionDetails transactionDetail = transactionService.updateTransactions(transactionId, transaction);
		return new ResponseEntity<TransactionDetails>(transactionDetail, HttpStatus.OK);
	}

}
