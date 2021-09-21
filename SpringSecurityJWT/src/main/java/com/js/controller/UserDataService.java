package com.js.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDataService {

	@GetMapping("/home")
	public String getData() {

		return "Welcome to JWT";
	}

}
