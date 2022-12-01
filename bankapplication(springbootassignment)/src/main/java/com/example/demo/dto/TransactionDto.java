package com.example.demo.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TransactionDto {

	long fromAccNo;

	long toAccNo;
	
	int amount;
	
	Date transactionDateTime;

}
