package com.example.demo.service;

import java.sql.Date;
import java.util.List;

import com.example.demo.dto.StatementResponseDto;

public interface StatementService {
//	List<Transaction> getStatement(long accNo, Date transactionDateTime);

	List<StatementResponseDto> getStatement(Date transactionDateTime, long accNo);

}
