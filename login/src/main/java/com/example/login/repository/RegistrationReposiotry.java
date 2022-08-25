package com.example.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login.entity.User;

public interface RegistrationReposiotry extends JpaRepository<User,Integer>{

	public User findByEmailId(String emailId);
	
	public User findByEmailIdAndPassword(String emailId, String password);

}
