package com.pod4.authorization.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.pod4.authorization.model.User;
import com.pod4.authorization.repository.UserRepository;
import com.pod4.authorization.service.UserService;

@SpringBootTest
class UserServiceTest {
	
	@MockBean
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;

	@Test
	void testFindUserId() {
		User u=new User(1,"Shah","123");	
		Mockito.when(userRepository.findByUsername(u.getUsername())).thenReturn(u);
		assertEquals(1,userService.findUserId(u.getUsername()));
	}

}
