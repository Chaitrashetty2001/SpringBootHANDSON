package com.example.demo.controller;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StatementResponseDto;
import com.example.demo.service.StatementServiceImp;

@RestController
@RequestMapping("/bank")
public class StatementController {

	@Autowired
	StatementServiceImp statementServiceImp;

	@GetMapping("/showTransaction")
	public List<StatementResponseDto> getStatement(@RequestParam("enter the date") Date transactionDateTime,
			@RequestParam("Enter your Account No") long accNo) throws ParseException {
		return statementServiceImp.getStatement(transactionDateTime, accNo);

	}

//	@GetMapping("/showTransaction")
//	public List<Transaction> getStatement(@RequestParam long accNo, @RequestParam Date transactionDateTime) {
//		return statementServiceImp.getStatement(accNo, transactionDateTime);
//	}

}
