package com.js.config;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.js.beans.CasesBO;

@Configuration
public class ConfigController {

	

	@Bean
	public ArrayList<CasesBO> getList() {

		return new ArrayList<CasesBO>();

	}
	
	
	


}
