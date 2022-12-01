package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.User;

public interface UserService {

	User saveuser(User user);

	List<User> getAllUsers();

	User updateUser(User user, int id);

	User getById(int id);

	void deleteById(int id);

	List<User> getAllUserPaginated(int pageNo, int pageSize);

	List<User> findAllByUserAge(int start, int end);

	List<User> getUserByfirstname(String firstname);

//	List<User> getUserByfirstnamelastname(String firstname, String lastname);

}
