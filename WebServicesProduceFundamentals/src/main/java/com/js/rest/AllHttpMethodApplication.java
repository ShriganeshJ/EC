package com.js.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(value = "com.js.controller")
public class AllHttpMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllHttpMethodApplication.class, args);
	}

}
