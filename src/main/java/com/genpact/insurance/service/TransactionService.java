package com.genpact.insurance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.insurance.model.TransactionDetails;
import com.genpact.insurance.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionRepository;

	public TransactionDetails saveTransaction(TransactionDetails transactions) {
		return transactionRepository.save(transactions);
	}

	public List<TransactionDetails> getTransactions(String userId) {
		return transactionRepository.findByUserId(userId);
	}

	public TransactionDetails updateTransactions(String transactionId, TransactionDetails transaction) {
		Optional<TransactionDetails> transactionDetail = transactionRepository.findById(transactionId);
		if (transactionDetail.isPresent()) {
			transactionRepository.save(transaction);
		}

		return transaction;
	}

}
