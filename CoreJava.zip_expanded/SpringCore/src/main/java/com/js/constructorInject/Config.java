package com.js.constructorInject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.js.first.SpringCore"})
public class Config {
	
	
	@Bean
	public RBI getRBI()
	{
		return new RBI("50000", "2.3");
	}
	
	@Bean
	public IdfcBank getIdfc()
	{
		return new IdfcBank(getRBI());
	}
	
	

}
