package com.js.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.js.controller" ,"com.js.config","com.js.dao"})

public class DdeTeamApplication {

	public static void main(String[] args) {
		SpringApplication.run(DdeTeamApplication.class, args);
	}

}
