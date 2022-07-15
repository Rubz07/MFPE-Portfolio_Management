package com.pod4.authorization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pod4.authorization.model.User;
import com.pod4.authorization.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;

	public int findUserId(String uname) {
		User user=userRepo.findByUsername(uname);
		return user.getId();
	}

}
