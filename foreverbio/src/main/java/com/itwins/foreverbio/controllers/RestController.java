package com.itwins.foreverbio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itwins.foreverbio.models.User;
import com.itwins.foreverbio.services.UserService;


@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "hello world";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/save-user")
	public String saveUser(@RequestParam String userName, @RequestParam String firstName, 
			@RequestParam String lastName, @RequestParam int age, @RequestParam String password) {
		
		User user = new User(userName,firstName,lastName,age,password);
		userService.saveUser(user);
		return "User saved successfully";
	}

	
}
