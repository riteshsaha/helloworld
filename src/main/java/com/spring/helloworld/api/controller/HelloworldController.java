package com.spring.helloworld.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	
}