package com.spring.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan("com")

public class SpringCrudProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudProjectApplication.class, args);
	}

	

	 
}