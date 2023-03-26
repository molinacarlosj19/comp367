package com.carlosmolina.comp367.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Good morning, Carlos, Welcome to COMP367!";
	}

}