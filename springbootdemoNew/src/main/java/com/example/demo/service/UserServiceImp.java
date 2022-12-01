package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	public UserRepository userRepository;

	@Override
	public User saveuser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User user, int id) {
		User u = userRepository.findById((Integer) id).get();
		u.setFirstname(user.getFirstname());
		u.setLastname(user.getLastname());

		return userRepository.save(u);

	}

	@Override
	public User getById(int id) {
		return userRepository.findById(id).get();

	}

	@Override
	public void deleteById(int id) {
		userRepository.deleteById(id);
	}

	@Override
	public List<User> getAllUserPaginated(int pageNo, int pageSize) {

		return null;
	}

	@Override
	public List<User> findAllByUserAge(int start, int end) {
		return userRepository.findAllByageBetween(start, end);

	}

	@Override
	public List<User> getUserByfirstname(String firstname) {

		return userRepository.findByfirstname(firstname);
	}

//	@Override
//	public List<User> getUserByfirstnamelastname(String firstname, String lastname) {
//	
//		return userRepository.findByfirstnameContainsorlastnameContains(firstname, lastname);
//	}

}
