package com.itwins.foreverbio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	@ResponseBody
	@RequestMapping("/")
	public String index() {
		return "hello world";
	}

	
	
}
