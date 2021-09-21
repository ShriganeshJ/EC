package com.js.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProposalController {

	@GetMapping("/")
	public String getData() {
		return "Welcome";
	}

	@GetMapping("/admin")
	public String getData01() {
		return "Welcome mr Admin";
	}

	@GetMapping("/user")
	public String getData03() {
		return "Welcome mr raj user";
	}

}
