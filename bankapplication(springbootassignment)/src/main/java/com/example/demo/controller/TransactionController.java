package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TransactionServiceImp;

@RestController
@RequestMapping("/bank")
public class TransactionController {

	@Autowired
	TransactionServiceImp transactionServiceImp;

	@PostMapping("/fundTransfer")
	public String fundTransfer(@RequestParam long fromAccNo, long toAccNo, int amount) {
		return transactionServiceImp.fundTransfer(fromAccNo, toAccNo, amount);
	}

}
