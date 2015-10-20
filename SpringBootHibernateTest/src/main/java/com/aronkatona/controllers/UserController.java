package com.aronkatona.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aronkatona.domain.User;
import com.aronkatona.service.interfaces.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("getUser")
	public String getUser() {
		userService.saveUser();
		return "asd";
	}
	
	@RequestMapping("saveLotOfUser")
	public Long getUser(@RequestParam Long numberOfUsers) {
		long start = System.currentTimeMillis();
		userService.saveLotOfUsers(numberOfUsers);
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	@RequestMapping("getAllUsers")
	public List<User> getAllUsers() {
		return userService.getAllUser();

	}
}
 