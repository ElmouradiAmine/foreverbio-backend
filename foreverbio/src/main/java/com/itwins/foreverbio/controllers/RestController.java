package com.itwins.foreverbio.controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@GetMapping("/")
	public String index() {
		return "hello world";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	
}
