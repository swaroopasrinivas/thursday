package com.example.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.entity.User;
import com.example.login.repository.RegistrationReposiotry;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationReposiotry repo;
	
	public User saveUser(User user) {
		return repo.save(user);
	}
	
	public User fetchUserByEmailId(String email) {
		return repo.findByEmailId(email);
	}

	public User fetchUserByEmailIdAndPassword(String email, String password) {
		return repo.findByEmailIdAndPassword(email, password);
	}

//	public User fetchUserByEmailIdAndPassword(String tempEmailId, String tempPass) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
