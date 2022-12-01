package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDto;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerServiceImp;

@RestController
@RequestMapping("/bank")
public class AccountController {

	@Autowired
	CustomerServiceImp customerServiceImp;

	@PostMapping("/addCustomer")
	public ResponseDto newCustomer(@RequestBody Customer customer, @RequestParam String accountType,
			@RequestParam float balance) {
		return customerServiceImp.insertNewCustomer(customer, accountType, balance);
	}

}
