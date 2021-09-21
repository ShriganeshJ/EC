package com.js.rest;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.js.service.FetchDetailsControllerImpl;
import com.js.service.FetchServiceImpl;
import com.js.service.UploadFileController;

@SpringBootApplication
@ComponentScan({ "com.js.service", "com.js.dao", "com.js.config" })
public class RestfulWebAndSpringBootJdbcApplication {
	static ApplicationContext ctx;

	public static void main(String[] args) {

		ctx = SpringApplication.run(RestfulWebAndSpringBootJdbcApplication.class, args);

		FetchDetailsControllerImpl fetch = ctx.getBean("fetch", FetchDetailsControllerImpl.class);

		fetch.getDetails();

		// UploadFileController uc =
		// ctx.getBean("fileupload",UploadFileController.class);
		// uc.uploadFiles();

		// FetchServiceImpl service = ctx.getBean(FetchServiceImpl.class);
		// System.out.println(service.uploadFiles());

	}

	@PreDestroy
	public static void shutDownContainer() {
		System.out.println("preDestory");
		// off the application context

		ConfigurableApplicationContext context = (ConfigurableApplicationContext) ctx;
		context.close();

	}

}
