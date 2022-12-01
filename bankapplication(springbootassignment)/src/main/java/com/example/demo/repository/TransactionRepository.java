package com.example.demo.repository;

import java.sql.Date;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.StatementResponseDto;
import com.example.demo.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	Collection<? extends StatementResponseDto> findByTransactionDateTimeAndFromAccNo(Date transactionDateTime,
			long accNo);

	Collection<? extends StatementResponseDto> findByTransactionDateTimeAndToAccNo(Date transactionDateTime,
			long accNo);

//	List<Transaction> findAllByTransactionDateTimeBetweenAndFromAccNoOrToAccNo(Date transactionDateTime, Date date,
//			long accNo, long accNo2);
//
//	

//	List<StatementResponseDto> findByFromAccNoAndTransactionDateTime(Date transactionDateTime, long accNo);
//
//	
//
//	List<Transaction> findAllByTransactionDateTimeBetweenAndFromAccNoOrToAccNo(java.sql.Date valueOf,
//			java.sql.Date valueOf2, long accNo, long accNo2);

}
