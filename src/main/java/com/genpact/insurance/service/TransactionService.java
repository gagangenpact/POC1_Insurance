package com.genpact.insurance.service;

import java.util.List;

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

	public TransactionDetails updateTransactions(String orderId, TransactionDetails transaction) {

		if (transactionRepository.findById(orderId).isPresent()) {
			TransactionDetails existingRecord = transactionRepository.findById(orderId).get();
			existingRecord.setAmount(transaction.getAmount());
			existingRecord.setBankName(transaction.getBankName());
			existingRecord.setDate(transaction.getDate());
			existingRecord.setPaymentGateway(transaction.getPaymentGateway());
			existingRecord.setPaymentMode(transaction.getPaymentMode());
			existingRecord.setTransactionId(transaction.getTransactionId());
			existingRecord.setTransactionStatus(transaction.getTransactionStatus());
			existingRecord.setUpi(transaction.getUpi());
			existingRecord.setUserId(transaction.getUserId());
			existingRecord.setWallets(transaction.getWallets());
			return transactionRepository.save(existingRecord);
		} else {
			return null;
		}

	}

}
