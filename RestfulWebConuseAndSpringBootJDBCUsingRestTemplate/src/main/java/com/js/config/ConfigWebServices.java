package com.js.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.js.exception.RestException;

@Configuration
public class ConfigWebServices {

	@Bean
	public RestTemplate getRestTemplate() {

		RestTemplate template = new RestTemplate();
		template.getMessageConverters().add(new StringHttpMessageConverter());
		template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        template.setErrorHandler(new RestException());
		return template;

	}

}
