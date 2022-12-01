package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.entity.Account;
import com.example.demo.entity.Customer;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {
	@Autowired
	private AccountRepository accRepo;

	@Autowired
	private CustomerRepository custRepo;

	@Override
	public ResponseDto insertNewCustomer(Customer customer, String accountType, float balance) {
		custRepo.save(customer);
		Account account1 = new Account();
		account1.setCustId(customer.getCustid());
		account1.setAccType(accountType);
		account1.setBalance(balance);

		accRepo.save(account1);

		ResponseDto responseDto = new ResponseDto(); // json format
		responseDto.setMessage("new customer added successfully");
		return responseDto;

	}

}
