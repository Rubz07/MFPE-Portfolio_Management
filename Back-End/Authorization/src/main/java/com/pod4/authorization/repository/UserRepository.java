package com.pod4.authorization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pod4.authorization.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByUsername(String uname);
	
}