package com.spring.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

@ComponentScan(basePackages = {"com.spring.*"})
public class WebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebservicesApplication.class, args);
	}

}
