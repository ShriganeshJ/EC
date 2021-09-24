package com.js.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//{"agg_id":143,"name":"rja","rc_number":"rc-00623","eng_number":"eng45214","chasiess_number":"chs4521","time":null}

@SpringBootApplication
@ComponentScan({"com.js.controller","com.js.service","com.js.exception"})
@EnableJpaRepositories(basePackages = "com.js.dao")
@EntityScan(basePackages = "com.js.entity")
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

}
