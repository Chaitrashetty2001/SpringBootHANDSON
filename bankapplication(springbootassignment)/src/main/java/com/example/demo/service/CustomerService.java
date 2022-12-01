package com.example.demo.service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.entity.Customer;

public interface CustomerService {

ResponseDto insertNewCustomer(Customer customer, String accountType, float balance);

}
