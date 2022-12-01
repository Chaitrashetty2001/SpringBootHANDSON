package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Account;
import com.example.demo.entity.Transaction;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.TransactionRepository;

@Service
public class TransactionServiceImp implements TransactionService {

	@Autowired
	private AccountRepository accRepo;

	@Autowired
	TransactionRepository transactionRepository;

	@Override
	@Transactional
	public String fundTransfer(long fromAccNo, long toAccNo, int amount) {

		Account debited = accRepo.findAccountByAccNo(fromAccNo);
		Account credited = accRepo.findAccountByAccNo(toAccNo);
		Transaction transaction = new Transaction();
		if (debited.getBalance() - amount > 0) {
			debited.setBalance(debited.getBalance() - amount);

			credited.setBalance(credited.getBalance() + amount);

			accRepo.save(debited);

			accRepo.save(credited);

			transaction.setFromAccNo(fromAccNo);
			transaction.setToAccNo(toAccNo);
			transaction.setAmount(amount);

			transactionRepository.save(transaction);

			return "sucessfully money transfered";
		}

		return "money transfere failed";

	}

}
