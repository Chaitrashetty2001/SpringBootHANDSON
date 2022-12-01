package com.example.demo.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StatementResponseDto;
import com.example.demo.repository.TransactionRepository;

@Service
public class StatementServiceImp implements StatementService {

	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public List<StatementResponseDto> getStatement(Date transactionDateTime, long accNo) {

		List<StatementResponseDto> crediteStatements = new ArrayList<>();
		List<StatementResponseDto> debitStatements = new ArrayList<>();

		crediteStatements.addAll(transactionRepository.findByTransactionDateTimeAndToAccNo(transactionDateTime, accNo));
		for (StatementResponseDto c1 : crediteStatements)
			c1.setStatus("Credited");
		debitStatements.addAll(transactionRepository.findByTransactionDateTimeAndFromAccNo(transactionDateTime, accNo));
		for (StatementResponseDto c1 : debitStatements)
			c1.setStatus("Debited");

		crediteStatements.addAll(debitStatements);

		return crediteStatements;

	}

//	@Override
//	public List<StatementResponseDto> getStatement2(String date1, long account) throws ParseException {
//		// TODO Auto-generated method stub
//		DateConverter converter=new DateConverter();
//		int month1= converter.getMonth(date1);
//		int year1=converter.getYear(date1);
//		
//		List<Date> dates=transactionRepository.Date(month1,year1);
//		List<StatementResponseDto> crediteStatements = new ArrayList<>();
//		List<StatementResponseDto> debitStatements = new ArrayList<>();
//		
//		if (!(dates.isEmpty())) {
//			
//			for(Date date:dates)
//			{
//				crediteStatements.addAll(transactionRepository.findByDateAndToaccount1(account,date));
//					for(StatementResponseDto c1:crediteStatements)
//						c1.setStatus("Credited");
//				debitStatements.addAll(transactionRepository.findByDateAndFromaccount1(account,date));
//					for(StatementResponseDto c1:debitStatements)
//						c1.setStatus("Debited");
//			}
//			crediteStatements.addAll(debitStatements);
//			
//		}
//		
//		return crediteStatements;
//	}

//	public List<StatementResponseDto> getStatement(Date transactionDateTime, long accNo) {
//		DateConverter converter=new DateConverter();
//		int month1= converter.getMonth(transactionDateTime);
//		int year1=converter.getYear(transactionDateTime);
//		
//		List<Date> dates=transactionRepository.Date(month1,year1);
//		List<StatementResponseDto> crediteStatements = new ArrayList<>();
//		List<StatementResponseDto> debitStatements = new ArrayList<>();
//		
//		if (!(dates.isEmpty())) {
//			
//			for(Date date:dates)
//			{
//				crediteStatements.addAll(transactionRepository.findByDateAndToaccount1(account,date));
//					for(StatementResponseDto c1:crediteStatements)
//						c1.setStatus("Credited");
//				debitStatements.addAll(transactionRepository.findByDateAndFromaccount1(account,date));
//					for(StatementResponseDto c1:debitStatements)
//						c1.setStatus("Debited");
//			}
//			crediteStatements.addAll(debitStatements);
//			
//		}
//		
//		return crediteStatements;
//		return null;
//	}
//	

//	public List<Transaction> getStatement(long accNo, LocalDate fromDate, LocalDate toDate) {
//		
//			
//			LocalDate startDate = fromDate;
//			LocalDate endDate = toDate;
//
//			
//			
//			return transactionRepository.findAllByTransactionDateTimeBetweenAndFromAccNoOrToAccNo(
//					Date.valueOf(startDate), Date.valueOf(endDate), accNo, accNo);
//
//		
//
//		
//	}

	/// EXECUTED ONE
//	public List<Transaction> getStatement(long accNo, Date transactionDateTime) {
//		
//		Date date = transactionDateTime;
//		
//		return transactionRepository.findAllByTransactionDateTimeBetweenAndFromAccNoOrToAccNo(transactionDateTime, date, accNo, accNo);
//	}

//	@Autowired
//	private AccountRepository accRepo;
//
//	@Autowired
//	private CustomerRepository custRepo;
//
//	@Autowired
//	TransactionRepository transactionRepository1;
//
//	public List<StatementResponseDto> getStatement(Date transactionDateTime, long accNo) {
//		Account account = accRepo.findByAccNo(accNo);
//		if (account != null) {
//			return transactionRepository.findByFromAccNoAndTransactionDateTime(transactionDateTime, accNo);
//		} else {
//			System.out.println("Account not found");
//		}
//
//		return null;
//	}

}
