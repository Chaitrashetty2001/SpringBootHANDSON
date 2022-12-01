package com.example.demo.service;

public interface TransactionService {

	String fundTransfer(long fromAccNo, long toAccNo, int amount);

}
