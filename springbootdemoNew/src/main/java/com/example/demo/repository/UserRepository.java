package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.User;

public interface UserRepository  extends JpaRepository<User, Integer> {
	
List<User> findByfirstname(String firstname);

List<User> findAllByageBetween(int start, int end);







//List<User> findByfirstnameContainsorlastnameContains(String firstname, String lastname);

}
