package com.example.demo.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StatementResponseDto {
	int amount;
	String status;
	Date transactionDateTime;
	long accountNo;

}
